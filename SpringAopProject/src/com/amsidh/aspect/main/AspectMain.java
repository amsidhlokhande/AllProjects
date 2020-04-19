package com.amsidh.aspect.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.aspect.domain.Circle;
import com.amsidh.aspect.service.ShapeServiceImpl;

public class AspectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeServiceImpl shapeService=context.getBean("shapeServiceImpl",ShapeServiceImpl.class);
	    shapeService.getCircle();
		
		
	}

}
