package routes;

import com.jfinal.config.Routes;

import controllers.HiController;

public class FrontRoutes extends Routes {
	public void config() {
		add("/hi", HiController.class);
	}
}