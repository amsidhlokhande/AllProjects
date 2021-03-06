package com.amsidh.spring.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();

		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
       
		
		
		shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		
		
	    

	}

}
