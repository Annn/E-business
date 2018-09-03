// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anna/IdeaProjects/play-products-crud-slick-bd/conf/routes
// @DATE:Mon Sep 03 16:05:25 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_2: controllers.ProductController,
  // @LINE:11
  CategoryController_4: controllers.CategoryController,
  // @LINE:16
  UserController_3: controllers.UserController,
  // @LINE:21
  OpinionController_1: controllers.OpinionController,
  // @LINE:26
  OrderedProductController_0: controllers.OrderedProductController,
  // @LINE:31
  OrderController_6: controllers.OrderController,
  // @LINE:36
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_2: controllers.ProductController,
    // @LINE:11
    CategoryController_4: controllers.CategoryController,
    // @LINE:16
    UserController_3: controllers.UserController,
    // @LINE:21
    OpinionController_1: controllers.OpinionController,
    // @LINE:26
    OrderedProductController_0: controllers.OrderedProductController,
    // @LINE:31
    OrderController_6: controllers.OrderController,
    // @LINE:36
    Assets_5: controllers.Assets
  ) = this(errorHandler, ProductController_2, CategoryController_4, UserController_3, OpinionController_1, OrderedProductController_0, OrderController_6, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_2, CategoryController_4, UserController_3, OpinionController_1, OrderedProductController_0, OrderController_6, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorys""", """controllers.CategoryController.getCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinion""", """controllers.OpinionController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinion""", """controllers.OpinionController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionController.getOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderedProduct""", """controllers.OrderedProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOrderedProduct""", """controllers.OrderedProductController.addOrderedProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderedProducts""", """controllers.OrderedProductController.getOrderedProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order""", """controllers.OrderController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorder""", """controllers.OrderController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.getOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_addProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_2.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_2.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_index3_invoker = createInvoker(
    CategoryController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "index",
      Nil,
      "GET",
      this.prefix + """category""",
      """ Category""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CategoryController_addCategory4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory4_invoker = createInvoker(
    CategoryController_4.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CategoryController_getCategory5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorys")))
  )
  private[this] lazy val controllers_CategoryController_getCategory5_invoker = createInvoker(
    CategoryController_4.getCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Nil,
      "GET",
      this.prefix + """categorys""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_index6_invoker = createInvoker(
    UserController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """user""",
      """ User""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_addUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_addUser7_invoker = createInvoker(
    UserController_3.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_getUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUser8_invoker = createInvoker(
    UserController_3.getUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_OpinionController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinion")))
  )
  private[this] lazy val controllers_OpinionController_index9_invoker = createInvoker(
    OpinionController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "index",
      Nil,
      "GET",
      this.prefix + """opinion""",
      """ Opinion""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_OpinionController_addOpinion10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion")))
  )
  private[this] lazy val controllers_OpinionController_addOpinion10_invoker = createInvoker(
    OpinionController_1.addOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "addOpinion",
      Nil,
      "POST",
      this.prefix + """addopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_OpinionController_getOpinion11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionController_getOpinion11_invoker = createInvoker(
    OpinionController_1.getOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinion",
      Nil,
      "GET",
      this.prefix + """opinions""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_OrderedProductController_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderedProduct")))
  )
  private[this] lazy val controllers_OrderedProductController_index12_invoker = createInvoker(
    OrderedProductController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderedProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """orderedProduct""",
      """ Ordered Product""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_OrderedProductController_addOrderedProduct13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOrderedProduct")))
  )
  private[this] lazy val controllers_OrderedProductController_addOrderedProduct13_invoker = createInvoker(
    OrderedProductController_0.addOrderedProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderedProductController",
      "addOrderedProduct",
      Nil,
      "POST",
      this.prefix + """addOrderedProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_OrderedProductController_getOrderedProducts14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderedProducts")))
  )
  private[this] lazy val controllers_OrderedProductController_getOrderedProducts14_invoker = createInvoker(
    OrderedProductController_0.getOrderedProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderedProductController",
      "getOrderedProducts",
      Nil,
      "GET",
      this.prefix + """orderedProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_OrderController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order")))
  )
  private[this] lazy val controllers_OrderController_index15_invoker = createInvoker(
    OrderController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "index",
      Nil,
      "GET",
      this.prefix + """order""",
      """ Order""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_OrderController_addOrder16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder16_invoker = createInvoker(
    OrderController_6.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_OrderController_getOrder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrder17_invoker = createInvoker(
    OrderController_6.getOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_2.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_2.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_2.getProducts)
      }
  
    // @LINE:11
    case controllers_CategoryController_index3_route(params@_) =>
      call { 
        controllers_CategoryController_index3_invoker.call(CategoryController_4.index)
      }
  
    // @LINE:12
    case controllers_CategoryController_addCategory4_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory4_invoker.call(CategoryController_4.addCategory)
      }
  
    // @LINE:13
    case controllers_CategoryController_getCategory5_route(params@_) =>
      call { 
        controllers_CategoryController_getCategory5_invoker.call(CategoryController_4.getCategory)
      }
  
    // @LINE:16
    case controllers_UserController_index6_route(params@_) =>
      call { 
        controllers_UserController_index6_invoker.call(UserController_3.index)
      }
  
    // @LINE:17
    case controllers_UserController_addUser7_route(params@_) =>
      call { 
        controllers_UserController_addUser7_invoker.call(UserController_3.addUser)
      }
  
    // @LINE:18
    case controllers_UserController_getUser8_route(params@_) =>
      call { 
        controllers_UserController_getUser8_invoker.call(UserController_3.getUser)
      }
  
    // @LINE:21
    case controllers_OpinionController_index9_route(params@_) =>
      call { 
        controllers_OpinionController_index9_invoker.call(OpinionController_1.index)
      }
  
    // @LINE:22
    case controllers_OpinionController_addOpinion10_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion10_invoker.call(OpinionController_1.addOpinion)
      }
  
    // @LINE:23
    case controllers_OpinionController_getOpinion11_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinion11_invoker.call(OpinionController_1.getOpinion)
      }
  
    // @LINE:26
    case controllers_OrderedProductController_index12_route(params@_) =>
      call { 
        controllers_OrderedProductController_index12_invoker.call(OrderedProductController_0.index)
      }
  
    // @LINE:27
    case controllers_OrderedProductController_addOrderedProduct13_route(params@_) =>
      call { 
        controllers_OrderedProductController_addOrderedProduct13_invoker.call(OrderedProductController_0.addOrderedProduct)
      }
  
    // @LINE:28
    case controllers_OrderedProductController_getOrderedProducts14_route(params@_) =>
      call { 
        controllers_OrderedProductController_getOrderedProducts14_invoker.call(OrderedProductController_0.getOrderedProducts)
      }
  
    // @LINE:31
    case controllers_OrderController_index15_route(params@_) =>
      call { 
        controllers_OrderController_index15_invoker.call(OrderController_6.index)
      }
  
    // @LINE:32
    case controllers_OrderController_addOrder16_route(params@_) =>
      call { 
        controllers_OrderController_addOrder16_invoker.call(OrderController_6.addOrder)
      }
  
    // @LINE:33
    case controllers_OrderController_getOrder17_route(params@_) =>
      call { 
        controllers_OrderController_getOrder17_invoker.call(OrderController_6.getOrder)
      }
  
    // @LINE:36
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
