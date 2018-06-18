package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ Future, ExecutionContext }

/**
  * A repository for users.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class UserRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  /**
    * Here we define the table. It will have a name of users
    */
  class UserTable(tag: Tag) extends Table[User](tag, "user") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def fullName = column[String]("fullName")

    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the User object.
      *
      * In this case, we are simply passing the id and name parameters to the User case classes
      * apply and unapply methods.
      */
    def * = (id, fullName) <> ((User.apply _).tupled, User.unapply)
  }

  /**
    * The starting point for all queries on the user table.
    */
  val usr = TableQuery[UserTable]

  /**
    * Create a user with the given name.
    *
    * This is an asynchronous operation, it will return a future of the created user, which can be used to obtain the
    * id for that user.
    */
  def create(fullName: String): Future[User] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (usr.map(c => (c.fullName))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning usr.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into ((fullName, id) => User(id, fullName))
      // And finally, insert the person into the database
      ) += fullName
  }

  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[User]] = db.run {
    usr.result
  }
}