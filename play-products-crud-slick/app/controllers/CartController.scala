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

class CartController @Inject()(opinionRepo: CartRepository, productsRepo: UserRepository,
                                 cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the cart form.
    */

  val cartForm: Form[CreateCartForm] = Form {
    mapping(
      "user" -> number
    )(CreateCartForm.apply)(CreateCartForm.unapply)
  }

  /**
    * The index action.
    */
  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map(prod => Ok(views.html.cart(cartForm, prod)))
  }

  def addCart = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle success.
    var a:Seq[User] = Seq[User]()
    val products = productsRepo.list().onComplete{
      case Success(prod) => a = prod
      case Failure(_) => print("fail")
    }

    cartForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the cart creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.cart(errorForm, a))
        )
      },
      // There were no errors in the from, so create the cart.
      cart => {
        opinionRepo.create(cart.user).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.CartController.index).flashing("success" -> "cart.created")
        }
      }
    )
  }


  /**
    * A REST endpoint that gets all the carts as JSON.
    */
  def getCart = Action.async { implicit request =>
    opinionRepo.list().map { op =>
      Ok(Json.toJson(op))
    }
  }
}

/**
  * The create cart form.
  *
  * Generally for forms, you should define separate objects to your models, since forms very often need to present data
  * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
  * that is generated once it's created.
  */
case class CreateCartForm(user: Int)