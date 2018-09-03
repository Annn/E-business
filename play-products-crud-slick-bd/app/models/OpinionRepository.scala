package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ Future, ExecutionContext }

/**
  * A repository for opinions.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class OpinionRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, val productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the opinion. It will have a product
    */
  import productRepository.ProductTable
  private val proID = TableQuery[ProductTable]

  private class OpinionTable(tag: Tag) extends Table[Opinion](tag, "opinion") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The product column */
    def product = column[Int]("product")

    /** The opinion column */
    def opin = column[String]("opin")

    def prod_fk = foreignKey("prod_fk", product, proID)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Opinion object.
      *
      * In this case, we are simply passing the id, product name parameters to the opinion? case classes
      * apply and unapply methods.
      */
    def * = (id, product, opin) <> ((Opinion.apply _).tupled, Opinion.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  /**
    * The starting point for all queries on the opinion table.
    */

  private val opinion = TableQuery[OpinionTable]


  /**
    * Create an opinion with the given product name and description.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(product: Int, opin: String): Future[Opinion] = db.run {
    // We create a projection of product name and opinion description columns, since we're not inserting a value for the id column
    (opinion.map(p => (p.product, p.opin))
      // Now define it to return the id, because we want to know what id was generated for the opinion
      returning opinion.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((product, opin), id) => Opinion(id, product, opin)}
      // And finally, insert the person into the database
      ) += (product, opin)
  }

  /**
    * List all the opinions in the database.
    */
  def list(): Future[Seq[Opinion]] = db.run {
    opinion.result
  }
}
