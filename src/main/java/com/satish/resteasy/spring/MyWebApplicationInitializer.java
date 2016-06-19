package com.satish.resteasy.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MyWebApplicationInitializer {//implements WebApplicationInitializer {

	public void onStartup(ServletContext sc) throws ServletException {
		/*AbstractRefreshableWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
		((AnnotationConfigWebApplicationContext)springContext).register(resteasyconfig.class);
		springContext.setServletContext(sc);
		
	//	ListenerBootstrap config = new ListenerBootstrap(sc);
	//	ResteasyDeployment deployment = config.createDeployment();
	//	deployment.start();
		
	//	sc.setAttribute(ResteasyProviderFactory.class.getName(), deployment.getProviderFactory());
	//	sc.setAttribute(Dispatcher.class.getName(), deployment.getDispatcher());
	//	sc.setAttribute(Registry.class.getName(), deployment.getRegistry());
		
	//	new SpringContextLoaderSupport().customizeContext(sc, springContext);
		
		ServletRegistration.Dynamic dynamic=  sc.addServlet("RestEasy", HttpServletDispatcher.class);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/*");
		
		sc.addListener(new ResteasyBootstrap());
		sc.addListener(new ContextLoaderListener(springContext));
		//sc.addListener(new ResteasyBootstrap());
*/	}

}
