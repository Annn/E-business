package models

import play.api.libs.json._

case class User(id: Int, name: String)

object User {
  implicit val categoryFormat = Json.format[User]
}