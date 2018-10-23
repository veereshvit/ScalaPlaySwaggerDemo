package controllers

import io.swagger.annotations.Api
import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
@Singleton
@Api(value="health")
class HealthCheck @Inject()(cc : ControllerComponents) extends AbstractController(cc){

  def health= Action {
    Ok("ok")
  }
}
