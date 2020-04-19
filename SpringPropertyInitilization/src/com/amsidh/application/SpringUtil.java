/**
 * 
 */
package com.amsidh.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.dtos.Triangle;

/**
 * @author amsidhlokhande
 *
 */
public class SpringUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.setType("Eqilateral");
		triangle.draw();

	}

}
