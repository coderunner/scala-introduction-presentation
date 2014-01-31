package controllers

import play.api.mvc.Controller

object Application extends Controller {

  def index = controllers.Assets.at("/public/reveal/", "index.html")

}