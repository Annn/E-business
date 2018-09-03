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

class OrderController @Inject()(orderRepository: OrderRepository,
//                                userRepository: UserRepository,
                                orderedProdRepository: OrderedProductRepository, cc: MessagesControllerComponents
                                    )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the order form.
    */
  val orderForm: Form[CreateOrderForm] = Form {
    mapping(
      "orderedprod_id" -> number,
//      "user_id" -> number,
      "order_date" -> nonEmptyText,
      "address" -> nonEmptyText,
      "cost" -> number
    )(CreateOrderForm.apply)(CreateOrderForm.unapply)
  }

  /**
    * The index action.
    */
  def index = Action.async { implicit request =>
    val orderedprods = orderedProdRepository.list()
    orderedprods.map(ordprod => Ok(views.html.order(orderForm, ordprod)))

//    val users = userRepository.list()
//    users.map(usr => Ok(views.html.order(orderForm, usr)))

//    orderedprods.flatMap { ordprod =>
//      users.map { usr =>
//        Ok(views.html.order(orderForm, ordprod, usr))
//      }
//    }
  }

  /**
    * The add order action.
    *
    * This is asynchronous, since we're invoking the asynchronous methods on OrderRepository.
    */

  def addOrder = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
//    var a:Seq[User] = Seq[User]()
//    val usrs = userRepository.list().onComplete{
//      case Success(usr) => a = usr
//      case Failure(_) => print("fail")
//    }
    var b:Seq[OrderedProduct] = Seq[OrderedProduct]()
    val ordprods = orderedProdRepository.list().onComplete{
      case Success(prods) => b = prods
      case Failure(_) => print("fail")
    }

    orderForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.order(errorForm, b))
        )
      },
      // There were no errors in the from, so create the order.
      order => {
        orderRepository.create(order.orderedprod_id, order.order_date, order.address, order.cost).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.OrderController.index).flashing("success" -> "order.created")
        }
      }
    )
  }


  /**
    * A REST endpoint that gets all the orders as JSON.
    */
  def getOrder = Action.async { implicit request =>
    orderRepository.list().map { ordr =>
      Ok(Json.toJson(ordr))
    }
  }
}

/**
  * The create order form.
  *
  * Generally for forms, you should define separate objects to your models, since forms very often need to present data
  * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
  * that is generated once it's created.
  */
case class CreateOrderForm(orderedprod_id: Int, order_date: String, address: String, cost: Int)