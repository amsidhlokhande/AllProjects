package com.amsidh.spring.core.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.spring.core.HelloWorld;

public class SpringTestApp {

	
	public static void main(String[] args) {
    
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:META-INF/spring/spring.xml");
		//HelloWorld helloWord=context.getBean(HelloWorld.class);
		HelloWorld helloWord=(HelloWorld)context.getBean("hello");
		System.out.println(helloWord.getMessage());
		helloWord=(HelloWorld)context.getBean("helloWorld");
		System.out.println(helloWord.getMessage());
	
	}
}
