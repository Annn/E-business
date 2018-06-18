
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

object opinion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOpinionForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opinion: Form[CreateOpinionForm], product: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.OpinionController.addOpinion())/*10.49*/ {_display_(Seq[Any](format.raw/*10.51*/("""
        """),_display_(/*11.10*/inputText(opinion("description"))),format.raw/*11.43*/("""

        """),format.raw/*13.9*/("""<select name="product" id="product">
        """),_display_(/*14.10*/for(prod <- product) yield /*14.30*/{_display_(Seq[Any](format.raw/*14.31*/("""
            """),format.raw/*15.13*/("""<option value=""""),_display_(/*15.29*/prod/*15.33*/.id),format.raw/*15.36*/("""">"""),_display_(/*15.39*/prod/*15.43*/.name),format.raw/*15.48*/("""</option>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</select>


        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),format.raw/*22.9*/("""<div class="buttons">
            <input type="submit" value="Add Opinion"/>
        </div>
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(opinion:Form[CreateOpinionForm],product:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(opinion,product)(request)

  def f:((Form[CreateOpinionForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (opinion,product) => (request) => apply(opinion,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 18:11:00 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/opinion.scala.html
                  HASH: 953d4e951e779ffdc972979943eb9bdd10c3a80b
                  MATRIX: 783->1|954->102|998->100|1025->118|1052->120|1066->127|1099->152|1145->161|1176->167|1191->174|1225->188|1256->190|1284->193|1318->219|1357->221|1389->227|1441->270|1481->272|1518->282|1572->315|1609->325|1682->371|1718->391|1757->392|1798->405|1841->421|1854->425|1878->428|1908->431|1921->435|1947->440|1997->459|2033->468|2081->489|2094->493|2125->503|2162->513|2289->610
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|44->20|44->20|44->20|46->22|49->25
                  -- GENERATED --
              */
          