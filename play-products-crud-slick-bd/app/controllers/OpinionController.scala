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

class OpinionController @Inject()(opinionRepo: OpinionRepository, productsRepo: ProductRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the opinion form.
    */
  val opinionForm: Form[CreateOpinionForm] = Form {
    mapping(
      "opinion" -> nonEmptyText,
      "product" -> number
    )(CreateOpinionForm.apply)(CreateOpinionForm.unapply)
  }

  /**
    * The index action.
    */
  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map(prod => Ok(views.html.opinion(opinionForm, prod)))

    /*
    .onComplete{
    case Success(categories) => Ok(views.html.index(productForm,categories))
    case Failure(t) => print("")
  }*/
  }

  /**
    * The add opinion action.
    *
    * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
    */
  /*
    def addProduct = Action.async { implicit request =>
      Ok(views.html.addproduct())
    }
  */

  def addOpinion = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[Product] = Seq[Product]()
    val products = productsRepo.list().onComplete{
      case Success(prod) => a=prod
      case Failure(_) => print("fail")
    }

    opinionForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.opinion(errorForm, a))
        )
      },
      // There were no errors in the from, so create the person.
      opinion => {
        opinionRepo.create(opinion.product, opinion.opinion ).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.OpinionController.index).flashing("success" -> "opinion.added")
        }
      }
    )
  }


  /**
    * A REST endpoint that gets all the people as JSON.
    */
  def getOpinion = Action.async { implicit request =>
    opinionRepo.list().map { op =>
      Ok(Json.toJson(op))
    }
  }
}

/**
  * The create opinion form.
  *
  * Generally for forms, you should define separate objects to your models, since forms very often need to present data
  * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
  * that is generated once it's created.
  */
case class CreateOpinionForm(opinion: String,  product: Int)