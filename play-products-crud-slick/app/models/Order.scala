package models

import play.api.libs.json._

case class Order(id: Long, cart: Int, order_date: String, address: String, cost: Float)

object Order {
  implicit val orderFormat = Json.format[Order]
}
