// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anna/IdeaProjects/play-products-crud-slick/conf/routes
// @DATE:Mon Jun 18 20:14:41 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:21
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getOpinion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinion")
    }
  
    // @LINE:22
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinion")
    }
  
  }

  // @LINE:41
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:26
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcart")
    }
  
    // @LINE:26
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:28
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "carts")
    }
  
  }

  // @LINE:11
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category")
    }
  
    // @LINE:13
    def getCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorys")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:16
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:18
    def getUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:16
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
  }

  // @LINE:36
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:36
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order")
    }
  
    // @LINE:38
    def getOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
  }

  // @LINE:31
  class ReverseProductCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def addProductCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcartProduct")
    }
  
    // @LINE:31
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cartProduct")
    }
  
    // @LINE:33
    def getCartProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "koszykProducts")
    }
  
  }


}
