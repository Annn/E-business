package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for productCart.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class OrderedProductRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, val productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of carts and products
    */
  import productRepository.ProductTable
  private val prod = TableQuery[ProductTable]

  class OrderedProductTable(tag: Tag) extends Table[OrderedProduct](tag, "ordered_product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def product_id = column[Int]("product_id")
    def number_prod = column[Int]("number_prod")

    def product_fk = foreignKey("prod_fk", product_id, prod)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the orderedProduct object.
      *
      * In this case, we are simply passing the id and product parameters to the orderedProduct case classes
      * apply and unapply methods.
      */
    def * = (id, product_id, number_prod) <> ((OrderedProduct.apply _).tupled, OrderedProduct.unapply)
  }

  /**
    * The starting point for all queries on the productCart table.
    */
  private  val orderedProd = TableQuery[OrderedProductTable]
  /**
    * Create an orderedProduct with the given product.
    *
    * This is an asynchronous operation, it will return a future of the created OrderedProduct, which can be used to obtain the
    * id for that OrderedProduct.
    */
  def create(product: Int, number:Int): Future[OrderedProduct] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (orderedProd.map(p => (p.product_id, p.number_prod))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning orderedProd.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((product, number), id) => OrderedProduct(id, product, number)}
      // And finally, insert the person into the database
      ) += (product, number)
  }

  /**
    * List all the ProductCart in the database.
    */
  def list(): Future[Seq[OrderedProduct]] = db.run {
    orderedProd.result
  }
}