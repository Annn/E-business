
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

object category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateCategoryForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categ: Form[CreateCategoryForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
    """),_display_(/*6.6*/request/*6.13*/.messages(key)),format.raw/*6.27*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    """),_display_(/*10.6*/form(routes.CategoryController.addCategory())/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
        """),_display_(/*11.10*/inputText(categ("name"))),format.raw/*11.34*/("""

        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

        """),format.raw/*15.9*/("""<div class="buttons">
            <input type="submit" value="Add category"/>
        </div>
    """)))}),format.raw/*18.6*/("""
""")))}))
      }
    }
  }

  def render(categ:Form[CreateCategoryForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(categ)(request)

  def f:((Form[CreateCategoryForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (categ) => (request) => apply(categ)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 18:11:00 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/category.scala.html
                  HASH: ef9f524bd27f7f464bdbf685b9a2ee599c76d8e2
                  MATRIX: 772->1|919->78|963->76|990->94|1017->96|1031->103|1064->128|1110->137|1141->143|1156->150|1190->164|1221->166|1249->169|1283->195|1322->197|1354->203|1408->248|1448->250|1485->260|1530->284|1568->295|1581->299|1612->309|1649->319|1777->417
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18
                  -- GENERATED --
              */
          