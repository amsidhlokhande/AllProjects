/**
 * 
 */
package com.amsidh.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

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
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Triangle triangle=(Triangle)factory.getBean("triangle");
		triangle.setType("Eqilateral");
		triangle.draw();

	}

}
