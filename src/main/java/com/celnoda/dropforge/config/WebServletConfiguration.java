package com.celnoda.dropforge.config;

import java.nio.file.DirectoryStream.Filter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webContext = 
				new AnnotationConfigWebApplicationContext();
		webContext.register(SpringMvcConfiguration.class);
		webContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(webContext));
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}
