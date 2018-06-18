package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for order.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */

@Singleton
class OrderRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, val cartRepository: CartRepository)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  import cartRepository.CartTable
//  c - cart
  private val c = TableQuery[CartTable]
  class OrderTable(tag: Tag) extends Table[Order](tag, "order") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("Order_id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def cart = column[Int]("cart")

    /** The age column */
    def order_date = column[String]("order_date")
    def address = column[String]("address")
    def cost = column[Float]("cost")

    def cart_fk = foreignKey("crt_fk", cart, c)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, cart, order_date, address, cost) <> ((Order.apply _).tupled, Order.unapply)
    //def * = (id, name) <> ((Category.apply _).tupled, Category.unapply)
  }

  /**
    * The starting point for all queries on the people table.
    */


  private val order = TableQuery[OrderTable]




  /**
    * Create a person with the given name and age.
    *
    * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
    * id for that person.
    */
  def create(cart: Int, order_date: String, address: String, cost: Float): Future[Order] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (order.map(p => (p.cart, p.order_date, p.address, p.cost))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning order.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((cart, order_date, address, cost), id) => Order(id, cart, order_date, address, cost)}
      // And finally, insert the person into the database
      ) += (cart, order_date, address, cost)
  }

  /**
    * List all the order in the database.
    */
  def list(): Future[Seq[Order]] = db.run {
    order.result
  }
}