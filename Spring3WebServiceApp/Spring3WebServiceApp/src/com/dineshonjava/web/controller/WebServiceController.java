package com.dineshonjava.web.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dineshonjava.web.model.Employee;
import com.dineshonjava.web.model.Employees;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class WebServiceController {
	@RequestMapping(method = RequestMethod.GET, value="/employees/{id}", headers="Accept=*/*")
	public @ResponseBody Employee getEmployeeById(@PathVariable String id){
		Employee employee = new Employee();
		employee.setId(1);
		employee.setSalary(50000l);
		employee.setName("Dinesh Rajput");
		employee.setAge(26);
		employee.setAddress("Sector 49-Noida");
		return employee;
	}
	
	@RequestMapping(method = RequestMethod.GET,  value="/employees", headers="Accept=*/*")
	public @ResponseBody Employees getEmployees(){
		Employees employees = new Employees();
		
		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setSalary(50000l);
		employee1.setName("Dinesh Rajput");
		employee1.setAge(26);
		employee1.setAddress("Sector 49- Noida");
		
		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setSalary(20000l);
		employee2.setName("Anamika Rajput");
		employee2.setAge(26);
		employee2.setAddress("Sector 49- Noida");
		employees.setEmployees(new ArrayList<Employee>());
		employees.getEmployees().add(employee1);
		employees.getEmployees().add(employee2);
		return employees;
	}
}
