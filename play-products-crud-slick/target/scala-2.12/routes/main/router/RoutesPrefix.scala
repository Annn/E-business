// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anna/IdeaProjects/play-products-crud-slick/conf/routes
// @DATE:Mon Jun 18 20:14:41 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
