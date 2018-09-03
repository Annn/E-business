package models

import play.api.libs.json._

case class Order(id: Int, orderedprod_id: Int, order_date: String, address: String, cost: Int)

object Order {
  implicit val orderFormat = Json.format[Order]
}
