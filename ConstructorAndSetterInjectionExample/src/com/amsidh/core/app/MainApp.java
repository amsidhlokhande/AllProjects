package com.amsidh.core.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.amsidh.core.domain.Triangle;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\workspaceportal\\ConstructorAndSetterInjectionExample\\src\\spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
