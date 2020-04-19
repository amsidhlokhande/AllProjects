/**
 * 
 */
package com.amsidh.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.amsidh.mvc.dto.Employee;
import com.amsidh.mvc.service.EmployeeService;

/**
 * @author VIRU
 * 
 */
@Controller

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value={"/","/index"},method=RequestMethod.GET)
	public ModelAndView indexPage(ModelAndView model) {
		model.addObject("message", "This is simple multiModule Project");
		model.setViewName("index");
		Employee employee=employeeService.getEmployeeByEmployeeCode(123);
		System.out.println(employee.getEmployeeName());
		return model;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
}
