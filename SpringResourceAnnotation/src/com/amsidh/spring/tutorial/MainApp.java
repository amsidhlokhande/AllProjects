package com.amsidh.spring.tutorial;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Circle: ");
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();

		
	}

}
