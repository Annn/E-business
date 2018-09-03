
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

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOrderForm],Seq[OrderedProduct],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm], orderedprod: Seq[OrderedProduct]
//        ,  users: Seq[User]
                                )(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/request/*7.9*/.flash.get("success").map/*7.34*/ { key =>_display_(Seq[Any](format.raw/*7.43*/("""
    """),_display_(/*8.6*/request/*8.13*/.messages(key)),format.raw/*8.27*/("""
""")))}),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Welcome to Ebiznes - order")/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
    """),_display_(/*12.6*/form(routes.OrderController.addOrder())/*12.45*/ {_display_(Seq[Any](format.raw/*12.47*/("""
        """),format.raw/*13.9*/("""<select name="orderedprod" id="orderedprod">
            """),_display_(/*14.14*/for(opr <- orderedprod) yield /*14.37*/{_display_(Seq[Any](format.raw/*14.38*/("""
            """),format.raw/*15.13*/("""<option value=""""),_display_(/*15.29*/opr/*15.32*/.id),format.raw/*15.35*/("""">"""),_display_(/*15.38*/opr/*15.41*/.id),format.raw/*15.44*/("""</option>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</select>

        """),_display_(/*19.10*/inputText(order("order date"))),format.raw/*19.40*/("""
        """),_display_(/*20.10*/inputText(order("address"))),format.raw/*20.37*/("""
        """),_display_(/*21.10*/inputText(order("cost"))),format.raw/*21.34*/("""

        """),_display_(/*23.10*/CSRF/*23.14*/.formField),format.raw/*23.24*/("""

        """),format.raw/*25.9*/("""<div class="buttons">
            <br>
            <input class="btn btn-primary" type="submit" value="Add Order"/>
        </div>
    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(order:Form[CreateOrderForm],orderedprod:Seq[OrderedProduct],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order,orderedprod)(request)

  def f:((Form[CreateOrderForm],Seq[OrderedProduct]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order,orderedprod) => (request) => apply(order,orderedprod)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 03 15:50:10 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick-bd/app/views/order.scala.html
                  HASH: 09acae82ab739211117d619fb4ae2a3b44a74c10
                  MATRIX: 786->1|1027->172|1071->170|1098->188|1125->190|1139->197|1172->222|1218->231|1249->237|1264->244|1298->258|1329->260|1358->263|1401->297|1441->299|1473->305|1521->344|1561->346|1597->355|1682->413|1721->436|1760->437|1801->450|1844->466|1856->469|1880->472|1910->475|1922->478|1946->481|1996->500|2032->509|2079->529|2130->559|2167->569|2215->596|2252->606|2297->630|2335->641|2348->645|2379->655|2416->665|2582->801
                  LINES: 21->1|26->5|29->4|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|33->9|35->11|35->11|35->11|36->12|36->12|36->12|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|43->19|43->19|44->20|44->20|45->21|45->21|47->23|47->23|47->23|49->25|53->29
                  -- GENERATED --
              */
          