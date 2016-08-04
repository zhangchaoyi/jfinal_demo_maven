package controllers;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class AnatationController extends Controller{
	@ActionKey("/")
	public void admin(){
		renderText("aa");
	}
	@ActionKey("/that")
	public void index(){
		renderText("xxx");
	}
	@ActionKey("/that/t/t/t/t")
	public void indexa(){
		renderText("xxx");
	}
	@ActionKey("/wrong1")
	public void wrong(){
		renderHtml("inner.html");
	}
	
}
