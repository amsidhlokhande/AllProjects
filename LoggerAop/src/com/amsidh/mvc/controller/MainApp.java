package com.amsidh.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.doms.EmployeeDom;
import com.amsidh.mvc.service.EmployeeService;
import com.amsidh.mvc.service.EmployeeServiceImpl;

public class MainApp {

	@Autowired
	private static EmployeeService employeeService;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-context.xml");
		employeeService=context.getBean(EmployeeServiceImpl.class);

		List<EmployeeDom> allEmployee = employeeService.getAllEmployee();
		for (EmployeeDom employeeDom : allEmployee) {
			System.out.println(employeeDom.getEmployeeId() + "           "
					+ employeeDom.getEmpName() + "      "
					+ employeeDom.getAddress() + "      "
					+ employeeDom.getContactNumber());
		}
	}
}
