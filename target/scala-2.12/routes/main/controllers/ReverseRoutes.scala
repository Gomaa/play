// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/yabbu/conf/routes
// @DATE:Wed Oct 03 22:53:56 GMT+03:00 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def post(_pf_escape_type:String, id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("type", _pf_escape_type)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
