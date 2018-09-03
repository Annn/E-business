
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

object orderedProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOrderedProductForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productCart: Form[CreateOrderedProductForm], products: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
  """),_display_(/*6.4*/request/*6.11*/.messages(key)),format.raw/*6.25*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes - ordered product")/*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
    """),_display_(/*10.6*/form(routes.OrderedProductController.addOrderedProduct())/*10.63*/{_display_(Seq[Any](format.raw/*10.64*/("""
        """),_display_(/*11.10*/inputText(productCart("number"))),format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<select name="product" id="product">
            """),_display_(/*13.14*/for(prod <- products) yield /*13.35*/{_display_(Seq[Any](format.raw/*13.36*/("""
            """),format.raw/*14.13*/("""<option value=""""),_display_(/*14.29*/prod/*14.33*/.id),format.raw/*14.36*/("""">"""),_display_(/*14.39*/prod/*14.43*/.name),format.raw/*14.48*/("""</option>
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</select>

        """),_display_(/*18.10*/CSRF/*18.14*/.formField),format.raw/*18.24*/("""
        """),format.raw/*19.9*/("""<div class="buttons">
            <input type="submit" value="Add Product"/>
        </div>
    """)))}),format.raw/*22.6*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(productCart:Form[CreateOrderedProductForm],products:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(productCart,products)(request)

  def f:((Form[CreateOrderedProductForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (productCart,products) => (request) => apply(productCart,products)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 02 17:32:15 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick-bd/app/views/orderedProduct.scala.html
                  HASH: dd5c79e92cf326c35646e96e81ad101248ac3c03
                  MATRIX: 797->1|980->114|1024->112|1051->130|1078->132|1092->139|1125->164|1171->173|1200->177|1215->184|1249->198|1280->200|1308->203|1360->247|1399->249|1431->255|1497->312|1536->313|1573->323|1626->355|1662->364|1739->414|1776->435|1815->436|1856->449|1899->465|1912->469|1936->472|1966->475|1979->479|2005->484|2059->507|2095->516|2142->536|2155->540|2186->550|2222->559|2349->656|2381->658
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|43->19|46->22|47->23
                  -- GENERATED --
              */
          