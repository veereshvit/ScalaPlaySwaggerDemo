package controllers

import com.google.inject.Inject
import javax.inject.Singleton
import play.api.mvc.{AbstractController, ControllerComponents}
@Singleton
class MyController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with App {
  def redirectDocs = Action {
    Redirect(url = "/assets/lib/swagger-ui/index.html", queryString = Map("url" -> Seq("/swagger.json")))
  }




}
