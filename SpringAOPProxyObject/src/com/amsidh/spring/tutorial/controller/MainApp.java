package com.amsidh.spring.tutorial.controller;

import com.amsidh.spring.tutorial.domain.Employee;
import com.amsidh.spring.tutorial.service.FactoryService;


public class MainApp {

	public static void main(String[] args) {
		
		FactoryService service=new FactoryService();
		Employee employee=(Employee)service.getBean("employee");
		employee.setEmployeeName("Amsidh Lokhande");
		System.out.println(employee.getEmployeeName());
		
	}

}
