package controllers;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
	public void method1(){
		renderText("Hello");
	}
	@ActionKey("/hello/hello")
	public void hello(){
		render("hello.html");
	}
	@ActionKey("/test1")
	public void index() {
		render("index.html");
	}
	@ActionKey("/wrong2")
	public void wrong(){
		render("inner.html");
	}

	public void testGetPara(){
		String para0=getPara(0);
		String para1=getPara(1);
		String para2=getPara(2);
		
		renderText(para0 + para1 + para2 );
	}
	
}