package controllers;

import play.*;
import play.data.*;
import models.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(views.html.index.render("hello"));
	}

	// @Transactional
	public static Result solution() {
		DynamicForm form = Form.form().bindFromRequest();
		String s1 = form.data().get("a");
		int a = Integer.valueOf(s1);
		String s2 = form.data().get("b");
		int b = Integer.valueOf(s2);
		String s3 = form.data().get("c");
		int c = Integer.valueOf(s3);
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return ok(
				"<h1> X1 = <input type =\"text\" value=" + x1
						+ "  disabled> <br> X2 = <input type =\"text\" value="
						+ x2 + "  disabled> </h1>").as("text/html");
	}

}
