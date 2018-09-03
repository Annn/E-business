package models

import play.api.libs.json._

case class OrderedProduct(id: Int, product_id: Int, number_prod: Int)

object OrderedProduct {
  implicit val orderedProd = Json.format[OrderedProduct]
}