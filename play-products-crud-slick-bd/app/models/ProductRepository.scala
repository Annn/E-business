package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
//import models.CategoryRepository
import scala.concurrent.{ Future, ExecutionContext }

/**
 * A repository for products.
 *
 * @param dbConfigProvider The Play db config provider. Play will inject this for you.
 */
@Singleton
class ProductRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, val categoryRepository: CategoryRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
   * Here we define the table. It will have a name of products
   */
  import categoryRepository.CategoryTable
  private val cat = TableQuery[CategoryTable]
  private val product = TableQuery[ProductTable]


  class ProductTable(tag: Tag) extends Table[Product](tag, "product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The price column */
    def price = column[Float]("price")

    /** The description column */
    def description = column[String]("description")

      /** The category column */
    def category = column[Int]("category")

    def category_fk = foreignKey("cat_fk", category, cat)(_.id)
    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the product object.
     *
     * In this case, we are simply passing the id, name, description and category parameters to the product case classes
     * apply and unapply methods.
     */
    def * = (id, name, price, description, category) <> ((Product.apply _).tupled, Product.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  /**
   * The starting point for all queries on the people table.
   */

//  import categoryRepository.CategoryTable

//  private val product = TableQuery[ProductTable]

//  private val cat = TableQuery[CategoryTable]


  /**
   * Create a product with the given name, description and category.
   *
   * This is an asynchronous operation, it will return a future of the created product, which can be used to obtain the
   * id for that product.
   */
  def create(name: String, price: Float, description: String, category: Int): Future[Product] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (product.map(p => (p.name, p.price, p.description, p.category))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning product.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((name, price, description, category), id) => Product(id, name, price, description, category)}
    // And finally, insert the product into the database
    ) += (name, price, description, category)
  }

  /**
   * List all the products in the database.
   */
  def list(): Future[Seq[Product]] = db.run {
    product.result
  }
}
