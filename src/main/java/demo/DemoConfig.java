package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;

import controllers.AnatationController;
import controllers.HelloController;
import controllers.HiController;
import routes.AdminRoutes;
import routes.FrontRoutes;

public class DemoConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		
		me.setDevMode(true);
	}

	public void configRoute(Routes me) {
		me.add(new FrontRoutes());
		me.add(new AdminRoutes());

	}

	public void configPlugin(Plugins me) {
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}