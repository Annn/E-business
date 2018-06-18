
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html  lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
        <!-- Bootstrap core CSS -->
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*12.70*/("""" rel="stylesheet">
        <link href=""""),_display_(/*13.22*/routes/*13.28*/.Assets.versioned("css/bootstrap.css")),format.raw/*13.66*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/(""""/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">E-business</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">Menu
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <br>
            <h1>"""),_display_(/*36.18*/title),format.raw/*36.23*/("""</h1>

            <div class="">
                """),_display_(/*39.18*/content),format.raw/*39.25*/("""
            """),format.raw/*40.13*/("""</div>
        </div>
        <!-- Bootstrap core JavaScript -->
        """),format.raw/*43.103*/("""
        """),format.raw/*44.9*/("""<script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*44.69*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 18 21:43:12 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick/app/views/main.scala.html
                  HASH: 7a89081bd83efe88d6cb199dce1d7fffcab067b1
                  MATRIX: 733->1|857->32|884->33|1143->265|1169->270|1262->336|1277->342|1340->384|1408->425|1423->431|1482->469|1587->547|1602->553|1663->592|2742->1644|2768->1649|2846->1700|2874->1707|2915->1720|3017->1887|3053->1896|3094->1910|3109->1916|3170->1956
                  LINES: 21->1|26->2|27->3|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|60->36|60->36|63->39|63->39|64->40|67->43|68->44|68->44|68->44|68->44
                  -- GENERATED --
              */
          