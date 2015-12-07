package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import service.HelloService;

public class Application extends Controller {
    public static Result index() {
        return ok(views.html.index.render(HelloService.hello() + ", Your new application is ready."));
    }
}
