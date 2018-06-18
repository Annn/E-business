
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

object cartProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateProductCartForm],Seq[Product],Seq[Cart],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productCart: Form[CreateProductCartForm], products: Seq[Product], carts: Seq[Cart])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
  """),_display_(/*6.4*/request/*6.11*/.messages(key)),format.raw/*6.25*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.ProductCartController.addProductCart())/*10.57*/{_display_(Seq[Any](format.raw/*10.58*/("""
        """),_display_(/*11.10*/inputText(productCart("number"))),format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<select name="product" id="product">
            """),_display_(/*13.14*/for(prod <- products) yield /*13.35*/{_display_(Seq[Any](format.raw/*13.36*/("""
            """),format.raw/*14.13*/("""<option value=""""),_display_(/*14.29*/prod/*14.33*/.id),format.raw/*14.36*/("""">"""),_display_(/*14.39*/prod/*14.43*/.name),format.raw/*14.48*/("""</option>
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</select>
        <select name="cart" id="cart">
            """),_display_(/*18.14*/for(crt <- carts) yield /*18.31*/{_display_(Seq[Any](format.raw/*18.32*/("""
            """),format.raw/*19.13*/("""<option value=""""),_display_(/*19.29*/crt/*19.32*/.id),format.raw/*19.35*/("""">"""),_display_(/*19.38*/crt/*19.41*/.id),format.raw/*19.44*/("""</option>
            """)))}),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</select>
        """),_display_(/*22.10*/CSRF/*22.14*/.formField),format.raw/*22.24*/("""
        """),format.raw/*23.9*/("""<div class="buttons">
            <input type="submit" value="Add Product"/>
        </div>
    """)))}),format.raw/*26.6*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(productCart:Form[CreateProductCartForm],products:Seq[Product],carts:Seq[Cart],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(productCart,products,carts)(request)

  def f:((Form[CreateProductCartForm],Seq[Product],Seq[Cart]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (productCart,products,carts) => (request) => apply(productCart,products,carts)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 20:49:57 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/cartProduct.scala.html
                  HASH: 91ae9503a56de2f04b89b35e31c41f1a606f2ffa
                  MATRIX: 801->1|999->129|1043->127|1070->145|1097->147|1111->154|1144->179|1190->188|1219->192|1234->199|1268->213|1299->215|1327->218|1361->244|1400->246|1432->252|1492->303|1531->304|1568->314|1621->346|1657->355|1734->405|1771->426|1810->427|1851->440|1894->456|1907->460|1931->463|1961->466|1974->470|2000->475|2054->498|2090->507|2179->569|2212->586|2251->587|2292->600|2335->616|2347->619|2371->622|2401->625|2413->628|2437->631|2491->654|2527->663|2573->682|2586->686|2617->696|2653->705|2780->802|2812->804
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|43->19|43->19|43->19|43->19|43->19|43->19|43->19|44->20|45->21|46->22|46->22|46->22|47->23|50->26|51->27
                  -- GENERATED --
              */
          