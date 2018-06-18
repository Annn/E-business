// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anna/IdeaProjects/play-products-crud-slick/conf/routes
// @DATE:Mon Jun 18 20:14:41 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_1: controllers.ProductController,
  // @LINE:11
  CategoryController_4: controllers.CategoryController,
  // @LINE:16
  UserController_2: controllers.UserController,
  // @LINE:21
  OpinionController_0: controllers.OpinionController,
  // @LINE:26
  CartController_3: controllers.CartController,
  // @LINE:31
  ProductCartController_5: controllers.ProductCartController,
  // @LINE:36
  OrderController_7: controllers.OrderController,
  // @LINE:41
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_1: controllers.ProductController,
    // @LINE:11
    CategoryController_4: controllers.CategoryController,
    // @LINE:16
    UserController_2: controllers.UserController,
    // @LINE:21
    OpinionController_0: controllers.OpinionController,
    // @LINE:26
    CartController_3: controllers.CartController,
    // @LINE:31
    ProductCartController_5: controllers.ProductCartController,
    // @LINE:36
    OrderController_7: controllers.OrderController,
    // @LINE:41
    Assets_6: controllers.Assets
  ) = this(errorHandler, ProductController_1, CategoryController_4, UserController_2, OpinionController_0, CartController_3, ProductCartController_5, OrderController_7, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_1, CategoryController_4, UserController_2, OpinionController_0, CartController_3, ProductCartController_5, OrderController_7, Assets_6, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.CartController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcart""", """controllers.CartController.addCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carts""", """controllers.CartController.getCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cartProduct""", """controllers.ProductCartController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcartProduct""", """controllers.ProductCartController.addProductCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """koszykProducts""", """controllers.ProductCartController.getCartProducts"""),
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
    ProductController_1.index,
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
    ProductController_1.addProduct,
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
    ProductController_1.getProducts,
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
    UserController_2.index,
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
    UserController_2.addUser,
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
    UserController_2.getUser,
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
    OpinionController_0.index,
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
    OpinionController_0.addOpinion,
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
    OpinionController_0.getOpinion,
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
  private[this] lazy val controllers_CartController_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_CartController_index12_invoker = createInvoker(
    CartController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "index",
      Nil,
      "GET",
      this.prefix + """cart""",
      """ Cart""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CartController_addCart13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcart")))
  )
  private[this] lazy val controllers_CartController_addCart13_invoker = createInvoker(
    CartController_3.addCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCart",
      Nil,
      "POST",
      this.prefix + """addcart""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CartController_getCart14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carts")))
  )
  private[this] lazy val controllers_CartController_getCart14_invoker = createInvoker(
    CartController_3.getCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCart",
      Nil,
      "GET",
      this.prefix + """carts""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ProductCartController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cartProduct")))
  )
  private[this] lazy val controllers_ProductCartController_index15_invoker = createInvoker(
    ProductCartController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCartController",
      "index",
      Nil,
      "GET",
      this.prefix + """cartProduct""",
      """ Products to cart""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ProductCartController_addProductCart16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcartProduct")))
  )
  private[this] lazy val controllers_ProductCartController_addProductCart16_invoker = createInvoker(
    ProductCartController_5.addProductCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCartController",
      "addProductCart",
      Nil,
      "POST",
      this.prefix + """addcartProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ProductCartController_getCartProducts17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("koszykProducts")))
  )
  private[this] lazy val controllers_ProductCartController_getCartProducts17_invoker = createInvoker(
    ProductCartController_5.getCartProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCartController",
      "getCartProducts",
      Nil,
      "GET",
      this.prefix + """koszykProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_OrderController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order")))
  )
  private[this] lazy val controllers_OrderController_index18_invoker = createInvoker(
    OrderController_7.index,
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

  // @LINE:37
  private[this] lazy val controllers_OrderController_addOrder19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder19_invoker = createInvoker(
    OrderController_7.addOrder,
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

  // @LINE:38
  private[this] lazy val controllers_OrderController_getOrder20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrder20_invoker = createInvoker(
    OrderController_7.getOrder,
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

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_ProductController_index0_invoker.call(ProductController_1.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_1.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_1.getProducts)
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
        controllers_UserController_index6_invoker.call(UserController_2.index)
      }
  
    // @LINE:17
    case controllers_UserController_addUser7_route(params@_) =>
      call { 
        controllers_UserController_addUser7_invoker.call(UserController_2.addUser)
      }
  
    // @LINE:18
    case controllers_UserController_getUser8_route(params@_) =>
      call { 
        controllers_UserController_getUser8_invoker.call(UserController_2.getUser)
      }
  
    // @LINE:21
    case controllers_OpinionController_index9_route(params@_) =>
      call { 
        controllers_OpinionController_index9_invoker.call(OpinionController_0.index)
      }
  
    // @LINE:22
    case controllers_OpinionController_addOpinion10_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion10_invoker.call(OpinionController_0.addOpinion)
      }
  
    // @LINE:23
    case controllers_OpinionController_getOpinion11_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinion11_invoker.call(OpinionController_0.getOpinion)
      }
  
    // @LINE:26
    case controllers_CartController_index12_route(params@_) =>
      call { 
        controllers_CartController_index12_invoker.call(CartController_3.index)
      }
  
    // @LINE:27
    case controllers_CartController_addCart13_route(params@_) =>
      call { 
        controllers_CartController_addCart13_invoker.call(CartController_3.addCart)
      }
  
    // @LINE:28
    case controllers_CartController_getCart14_route(params@_) =>
      call { 
        controllers_CartController_getCart14_invoker.call(CartController_3.getCart)
      }
  
    // @LINE:31
    case controllers_ProductCartController_index15_route(params@_) =>
      call { 
        controllers_ProductCartController_index15_invoker.call(ProductCartController_5.index)
      }
  
    // @LINE:32
    case controllers_ProductCartController_addProductCart16_route(params@_) =>
      call { 
        controllers_ProductCartController_addProductCart16_invoker.call(ProductCartController_5.addProductCart)
      }
  
    // @LINE:33
    case controllers_ProductCartController_getCartProducts17_route(params@_) =>
      call { 
        controllers_ProductCartController_getCartProducts17_invoker.call(ProductCartController_5.getCartProducts)
      }
  
    // @LINE:36
    case controllers_OrderController_index18_route(params@_) =>
      call { 
        controllers_OrderController_index18_invoker.call(OrderController_7.index)
      }
  
    // @LINE:37
    case controllers_OrderController_addOrder19_route(params@_) =>
      call { 
        controllers_OrderController_addOrder19_invoker.call(OrderController_7.addOrder)
      }
  
    // @LINE:38
    case controllers_OrderController_getOrder20_route(params@_) =>
      call { 
        controllers_OrderController_getOrder20_invoker.call(OrderController_7.getOrder)
      }
  
    // @LINE:41
    case controllers_Assets_versioned21_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
