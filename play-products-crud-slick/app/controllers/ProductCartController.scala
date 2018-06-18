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

class ProductCartController @Inject()( productCartRepository: ProductCartRepository, cartRepository: CartRepository,  productsRepo: ProductRepository,
                                         cc: MessagesControllerComponents
                                       )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the person form.
    */


  val productCartForm: Form[CreateProductCartForm] = Form {
    mapping(
      "cart" -> number,
      "product" -> number,
      "number" -> number
    )(CreateProductCartForm.apply)(CreateProductCartForm.unapply)
  }
  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    val carts = cartRepository.list()
    products.flatMap { prod =>
      carts.map { crts =>
        Ok(views.html.cartProduct(productCartForm, prod, crts))
      }
    }
  }
  def addProductCart = Action.async { implicit request =>
    var a:Seq[Product] = Seq[Product]()
    var b:Seq[Cart] = Seq[Cart]()

    print(a)
    print(b)

    val products = productsRepo.list().onComplete{
      case Success(pro) => a= pro
      case Failure(_) => print("fail")
    }
    val carts = cartRepository.list().onComplete{
      case Success(crt) => b = crt
      case Failure(_) => print("fail")
    }
    productCartForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.cartProduct(errorForm,a,b))
        )
      },
      // There were no errors in the from, so create the person.
      productCart => {
        productCartRepository.create(productCart.cart, productCart.product, productCart.number).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.ProductCartController.index).flashing("success" -> "product-cart.created")
        }
      }
    )


  }

  def getCartProducts = Action.async { implicit request =>
    productCartRepository.list().map { products =>
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
case class CreateProductCartForm(cart: Int, product: Int, number: Int)