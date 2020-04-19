/**
 * 
 */
package com.amsidh.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.intf.Shape;

/**
 * @author VIRU
 * 
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();
		Shape triangle = (Shape) context.getBean("triangle");
		triangle.draw();

		Shape circle = (Shape) context.getBean("circle");
		circle.draw();

		Shape rectangle = (Shape) context.getBean("rectangle");
		rectangle.draw();

	}

}
