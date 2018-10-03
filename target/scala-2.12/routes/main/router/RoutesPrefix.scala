// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Development/yabbu/conf/routes
// @DATE:Wed Oct 03 22:53:56 GMT+03:00 2018


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
