package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class OrderedProductController @Inject()( orderedProductRepository: OrderedProductRepository, productsRepo: ProductRepository,
                                         cc: MessagesControllerComponents
                                       )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the person form.
    */


  val orderedProductForm: Form[CreateOrderedProductForm] = Form {
    mapping(
      "product_id" -> number,
      "number_prod" -> number
    )(CreateOrderedProductForm.apply)(CreateOrderedProductForm.unapply)
  }
  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map (prod =>
      Ok(views.html.orderedProduct(orderedProductForm, prod))
    )
  }
  def addOrderedProduct = Action.async { implicit request =>
    var a:Seq[Product] = Seq[Product]()

    print(a)

    val products = productsRepo.list().onComplete{
      case Success(prods) => a= prods
      case Failure(_) => print("fail")
    }

    orderedProductForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.orderedProduct(errorForm, a))
        )
      },
      // There were no errors in the from, so create the person.
      orderedProduct => {
        orderedProductRepository.create(orderedProduct.product_id, orderedProduct.number_prod).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.OrderedProductController.index).flashing("success" -> "ordered_product.created")
        }
      }
    )


  }

  def getOrderedProducts = Action.async { implicit request =>
    orderedProductRepository.list().map { products =>
      Ok(Json.toJson(products))
    }
  }


}

/**
  * The create productCart form.
  *
  * Generally for forms, you should define separate objects to your models, since forms very often need to present data
  * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
  * that is generated once it's created.
  */
case class CreateOrderedProductForm(product_id: Int, number_prod: Int)