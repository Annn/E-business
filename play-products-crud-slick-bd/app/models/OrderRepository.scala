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
class OrderRepository @Inject()(dbConfigProvider: DatabaseConfigProvider,
//                                val userRepository: UserRepository,
                                val orderedProdRepo: OrderedProductRepository)
                               (implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of people
    */
  import orderedProdRepo.OrderedProductTable
//  import userRepository.UserTable

  private val ordrprod = TableQuery[OrderedProductTable]
//  private val user = TableQuery[UserTable]

  class OrderTable(tag: Tag) extends Table[Order](tag, "order") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("Order_id", O.PrimaryKey, O.AutoInc)

    /** The ordered product id column */
    def orderedprod_id = column[Int]("orderedproduct_id")
    /** The user id column */
//    def user_id = column[Int]("user_id")

    /** Other columns */
    def order_date = column[String]("order_date")
    def address = column[String]("address")
    def cost = column[Int]("cost")

    def orderedprod_fk = foreignKey("orderedprod_fk", orderedprod_id, ordrprod)(_.id)
//    def user_fk = foreignKey("user_fk", user_id, user)(_.id)
    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Order object.
      *
      * In this case, we are passing the id, ordered product and users id and order parameters
      * to the Order case classes apply and unapply methods.
      */
    def * = (id, orderedprod_id,  order_date, address, cost) <> ((Order.apply _).tupled, Order.unapply)
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
  def create(orderedprod_id: Int,  order_date: String, address: String, cost: Int): Future[Order] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (order.map(p => (p.orderedprod_id,  p.order_date, p.address, p.cost))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning order.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((orderedprod_id,  order_date, address, cost), id) => Order(id, orderedprod_id,  order_date, address, cost)}
      // And finally, insert the person into the database
      ) += (orderedprod_id,  order_date, address, cost)
  }

  /**
    * List all the order in the database.
    */
  def list(): Future[Seq[Order]] = db.run {
    order.result
  }
}