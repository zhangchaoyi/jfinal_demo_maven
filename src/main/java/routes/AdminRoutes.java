package routes;

import com.jfinal.config.Routes;

import controllers.AnatationController;
import controllers.HelloController;

public class AdminRoutes extends Routes {
	public void config() {
		add("/admin", AnatationController.class);
		add("/admin/user", HelloController.class, "/index");
	}
}