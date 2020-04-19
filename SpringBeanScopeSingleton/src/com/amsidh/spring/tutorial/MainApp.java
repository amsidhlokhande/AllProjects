package com.amsidh.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//BeanFactory factory =new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle=(Triangle) factory.getBean("triangle");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();

		Triangle triangle2=(Triangle) context.getBean("triangle");
		triangle2.draw();

		Triangle triangle3=(Triangle) context.getBean("triangle");
		triangle3.draw();

	}

}
