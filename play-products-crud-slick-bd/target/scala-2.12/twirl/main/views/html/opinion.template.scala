
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

"""),_display_(/*9.2*/main("Welcome to Ebiznes - opinion")/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
    """),_display_(/*10.6*/form(routes.OpinionController.addOpinion())/*10.49*/ {_display_(Seq[Any](format.raw/*10.51*/("""
        """),_display_(/*11.10*/inputText(opinion("description"))),format.raw/*11.43*/("""

        """),format.raw/*13.9*/("""<select name="product" id="product">
        """),_display_(/*14.10*/for(prod <- product) yield /*14.30*/{_display_(Seq[Any](format.raw/*14.31*/("""
            """),format.raw/*15.13*/("""<option value=""""),_display_(/*15.29*/prod/*15.33*/.id),format.raw/*15.36*/("""">"""),_display_(/*15.39*/prod/*15.43*/.name),format.raw/*15.48*/("""</option>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</select>


        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),format.raw/*22.9*/("""<div class="buttons">
            <br>
            <input class="btn btn-primary" type="submit" value="Add Opinion"/>
        </div>
    """)))}),format.raw/*26.6*/("""
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
                  DATE: Tue Jun 19 13:14:03 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/opinion.scala.html
                  HASH: eee7fef86e8b5b4d41192bd0fdadba317c5ba17f
                  MATRIX: 783->1|954->102|998->100|1025->118|1052->120|1066->127|1099->152|1145->161|1176->167|1191->174|1225->188|1256->190|1284->193|1328->229|1367->231|1399->237|1451->280|1491->282|1528->292|1582->325|1619->335|1692->381|1728->401|1767->402|1808->415|1851->431|1864->435|1888->438|1918->441|1931->445|1957->450|2007->469|2043->478|2091->499|2104->503|2135->513|2172->523|2340->661
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|44->20|44->20|44->20|46->22|50->26
                  -- GENERATED --
              */
          