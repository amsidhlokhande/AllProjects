package com.amsidh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.collections.AllCollection;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
		AllCollection collection=(AllCollection)context.getBean("allCollection");
		System.out.println(collection.toString());
		
		

	}

}
