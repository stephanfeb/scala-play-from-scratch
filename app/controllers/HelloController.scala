/*The MIT License (MIT)

Copyright (c) 2015 Stephan M. February 

*/

package controllers

import play.api.mvc.{Controller, Action}
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class HelloController extends Controller {
  def hello(name: String) = Action {
    Ok(s"Hello, ${name}")
  }
}
