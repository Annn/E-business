
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
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*16.70*/("""" rel="stylesheet">
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("css/bootstrap.css")),format.raw/*17.66*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/(""""/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" role="navigation">
            <a class="navbar-brand" href="#">E-business</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item active"><a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a></li>
                        <li class="nav-item"><a class="nav-link" href="https://github.com/mohiva/play-silhouette-seed">GitHub pss </a></li>
                        <li class="nav-item"><a class="nav-link" href="/orderedProduct">Cart</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="nav-item"><a class="nav-link" href="#">Log in</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Sign in</a></li>
                    </ul>
                </nav>
        </nav>

            """),format.raw/*40.219*/("""
                """),format.raw/*41.62*/("""
            """),format.raw/*42.26*/("""

            """),format.raw/*44.83*/("""
                """),format.raw/*45.52*/("""
                    """),format.raw/*46.53*/("""
                        """),format.raw/*47.105*/("""
                    """),format.raw/*48.30*/("""
                    """),format.raw/*49.53*/("""
                        """),format.raw/*50.105*/("""
                    """),format.raw/*51.30*/("""
                """),format.raw/*52.26*/("""
                """),format.raw/*53.57*/("""
                    """),format.raw/*54.53*/("""
                        """),format.raw/*55.68*/("""
                    """),format.raw/*56.30*/("""
                    """),format.raw/*57.53*/("""
                        """),format.raw/*58.69*/("""
                    """),format.raw/*59.30*/("""
                """),format.raw/*60.26*/("""
            """),format.raw/*61.23*/("""
        """),format.raw/*62.19*/("""
        """),format.raw/*63.9*/("""<div class="container">
            <br>
            <h1>"""),_display_(/*65.18*/title),format.raw/*65.23*/("""</h1>

            <div class="">
                """),_display_(/*68.18*/content),format.raw/*68.25*/("""
            """),format.raw/*69.13*/("""</div>
        </div>
        <!-- Bootstrap core JavaScript -->
        """),format.raw/*72.103*/("""
        """),format.raw/*73.9*/("""<script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*73.69*/(""""></script>
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
                  DATE: Mon Sep 03 16:34:05 CEST 2018
                  SOURCE: /Users/anna/IdeaProjects/play-products-crud-slick-bd/app/views/main.scala.html
                  HASH: 7c8ffd1820eb0d385af76b2ff33cd07d6adb3ba3
                  MATRIX: 733->1|857->32|884->33|1143->265|1169->270|1712->786|1727->792|1790->834|1858->875|1873->881|1932->919|2037->997|2052->1003|2113->1042|3463->2569|3508->2631|3549->2657|3591->2741|3636->2793|3685->2846|3739->2951|3788->2981|3837->3034|3891->3139|3940->3169|3985->3195|4030->3252|4079->3305|4132->3373|4181->3403|4230->3456|4283->3525|4332->3555|4377->3581|4418->3604|4455->3623|4491->3632|4576->3690|4602->3695|4680->3746|4708->3753|4749->3766|4851->3933|4887->3942|4928->3956|4943->3962|5004->4002
                  LINES: 21->1|26->2|27->3|34->10|34->10|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|64->40|65->41|66->42|68->44|69->45|70->46|71->47|72->48|73->49|74->50|75->51|76->52|77->53|78->54|79->55|80->56|81->57|82->58|83->59|84->60|85->61|86->62|87->63|89->65|89->65|92->68|92->68|93->69|96->72|97->73|97->73|97->73|97->73
                  -- GENERATED --
              */
          