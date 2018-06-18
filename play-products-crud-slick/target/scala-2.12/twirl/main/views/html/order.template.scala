
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

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOrderForm],Seq[Cart],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm], carts: Seq[Cart])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.OrderController.addOrder())/*10.45*/ {_display_(Seq[Any](format.raw/*10.47*/("""
        """),format.raw/*11.9*/("""<select name="cart" id="cart">
            """),_display_(/*12.14*/for(crt <- carts) yield /*12.31*/{_display_(Seq[Any](format.raw/*12.32*/("""
            """),format.raw/*13.13*/("""<option value=""""),_display_(/*13.29*/crt/*13.32*/.id),format.raw/*13.35*/("""">"""),_display_(/*13.38*/crt/*13.41*/.id),format.raw/*13.44*/("""</option>
        """)))}),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""</select>
        """),_display_(/*16.10*/inputText(order("order date"))),format.raw/*16.40*/("""
        """),_display_(/*17.10*/inputText(order("address"))),format.raw/*17.37*/("""
        """),_display_(/*18.10*/inputText(order("cost"))),format.raw/*18.34*/("""

        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),format.raw/*22.9*/("""<div class="buttons">
            <input type="submit" value="Add Order"/>
        </div>
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(order:Form[CreateOrderForm],carts:Seq[Cart],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order,carts)(request)

  def f:((Form[CreateOrderForm],Seq[Cart]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order,carts) => (request) => apply(order,carts)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 21:21:08 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/order.scala.html
                  HASH: 9569c323bcc2f6ab30e91dcac6cbd5b7c8345f98
                  MATRIX: 776->1|938->93|982->91|1009->109|1036->111|1050->118|1083->143|1129->152|1160->158|1175->165|1209->179|1240->181|1268->184|1302->210|1341->212|1373->218|1421->257|1461->259|1497->268|1568->312|1601->329|1640->330|1681->343|1724->359|1736->362|1760->365|1790->368|1802->371|1826->374|1876->393|1912->402|1958->421|2009->451|2046->461|2094->488|2131->498|2176->522|2214->533|2227->537|2258->547|2295->557|2420->652
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|38->14|39->15|40->16|40->16|41->17|41->17|42->18|42->18|44->20|44->20|44->20|46->22|49->25
                  -- GENERATED --
              */
          