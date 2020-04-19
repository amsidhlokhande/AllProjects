package com.amsidh.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
public class WebConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
       AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
       context.register(Config.class);
       
       Dynamic servlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(context));
       servlet.addMapping("/");
       servlet.setLoadOnStartup(0);
       
	}

}
