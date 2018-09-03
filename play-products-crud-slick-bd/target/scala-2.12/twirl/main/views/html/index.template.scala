
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.37*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes - products")/*9.39*/{_display_(Seq[Any](format.raw/*9.40*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
	  	"""),_display_(/*12.6*/inputText(product("price"))),format.raw/*12.33*/("""
		"""),_display_(/*13.4*/inputText(product("description"))),format.raw/*13.37*/("""

	  """),format.raw/*15.4*/("""<select name="category" id="category">
		"""),_display_(/*16.4*/for(cat <- category) yield /*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
			"""),format.raw/*17.4*/("""<option value=""""),_display_(/*17.20*/cat/*17.23*/.id),format.raw/*17.26*/("""">"""),_display_(/*17.29*/cat/*17.32*/.name),format.raw/*17.37*/("""</option>
		""")))}),format.raw/*18.4*/("""
	  """),format.raw/*19.4*/("""</select>


		"""),_display_(/*22.4*/CSRF/*22.8*/.formField),format.raw/*22.18*/("""

		"""),format.raw/*24.3*/("""<div class="buttons">
            <br>
			<input class="btn btn-primary" type="submit" value="Add Product"/>
		</div>

	    """),format.raw/*31.29*/("""
		    """),format.raw/*32.48*/("""
	    """),format.raw/*33.16*/("""
	""")))}),format.raw/*34.3*/("""
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 01 21:33:29 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/index.scala.html
                  HASH: e25a4fea30bc6a6a69a0c6f71d757334729bc9fb
                  MATRIX: 782->1|955->140|1000->138|1027->156|1054->158|1068->165|1101->190|1147->199|1177->204|1192->211|1226->225|1257->227|1285->230|1330->267|1368->268|1398->272|1450->315|1490->317|1520->321|1567->347|1599->353|1647->380|1677->384|1731->417|1763->422|1831->464|1867->484|1906->485|1937->489|1980->505|1992->508|2016->511|2046->514|2058->517|2084->522|2127->535|2158->539|2199->554|2211->558|2242->568|2273->572|2425->742|2460->790|2494->806|2527->809|2559->811
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|39->15|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|41->17|41->17|42->18|43->19|46->22|46->22|46->22|48->24|53->31|54->32|55->33|56->34|57->35
                  -- GENERATED --
              */
          