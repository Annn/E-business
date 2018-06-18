package models

import play.api.libs.json._

case class ProductCart(id: Long, cart: Int, product: Long, number: Int)

object ProductCart {
  implicit val productCart = Json.format[ProductCart]
}