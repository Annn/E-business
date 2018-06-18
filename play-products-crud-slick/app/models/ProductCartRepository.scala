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
class ProductCartRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, val cartRepository: CartRepository, val productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of carts and products
    */
  import cartRepository.CartTable
  import productRepository.ProductTable
  private val crt = TableQuery[CartTable]
  private val prod = TableQuery[ProductTable]

  class ProductCartTable(tag: Tag) extends Table[ProductCart](tag, "productcart") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def cart = column[Int]("cart")
    def product = column[Long]("product")
    def number = column[Int]("number")

    def product_fk = foreignKey("prod_fk", product, prod)(_.id)
    def cart_fk = foreignKey("crt_fk", cart, crt)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the productCart object.
      *
      * In this case, we are simply passing the id, cart and product parameters to the productcart case classes
      * apply and unapply methods.
      */
    def * = (id, cart, product, number) <> ((ProductCart.apply _).tupled, ProductCart.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  /**
    * The starting point for all queries on the productCart table.
    */
  private  val cartProduct = TableQuery[ProductCartTable]
  /**
    * Create a productcart with the given cart and product.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(cart: Int, product: Int, number:Int): Future[ProductCart] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (cartProduct.map(p => (p.cart, p.product, p.number))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning cartProduct.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((cart, product, number), id) => ProductCart(id, cart, product, number)}
      // And finally, insert the person into the database
      ) += (cart, product, number)
  }

  /**
    * List all the ProductCart in the database.
    */
  def list(): Future[Seq[ProductCart]] = db.run {
    cartProduct.result
  }
}