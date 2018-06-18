
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateCartForm],Seq[User],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: Form[CreateCartForm], product: Seq[User])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.CartController.addCart())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""

        """),format.raw/*12.9*/("""<select name="user" id="user">
        """),_display_(/*13.10*/for(prod <- product) yield /*13.30*/{_display_(Seq[Any](format.raw/*13.31*/("""
            """),format.raw/*14.13*/("""<option value=""""),_display_(/*14.29*/prod/*14.33*/.id),format.raw/*14.36*/("""">"""),_display_(/*14.39*/prod/*14.43*/.name),format.raw/*14.48*/("""</option>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""</select>

        """),_display_(/*18.10*/CSRF/*18.14*/.formField),format.raw/*18.24*/("""

        """),format.raw/*20.9*/("""<div class="buttons">
            <input type="submit" value="add cart"/>
        </div>
    """)))}),format.raw/*23.6*/("""
""")))}))
      }
    }
  }

  def render(cart:Form[CreateCartForm],product:Seq[User],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cart,product)(request)

  def f:((Form[CreateCartForm],Seq[User]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cart,product) => (request) => apply(cart,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 18:11:00 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/cart.scala.html
                  HASH: 2913aad9b6e26b8cb71af6b13eebf1a9083e5d3e
                  MATRIX: 774->1|936->93|980->91|1007->109|1034->111|1048->118|1081->143|1127->152|1158->158|1173->165|1207->179|1238->181|1266->184|1300->210|1339->212|1371->218|1417->255|1457->257|1494->267|1561->307|1597->327|1636->328|1677->341|1720->357|1733->361|1757->364|1787->367|1800->371|1826->376|1876->395|1912->404|1959->424|1972->428|2003->438|2040->448|2164->542
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|44->20|47->23
                  -- GENERATED --
              */
          