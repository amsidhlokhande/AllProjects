package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.doms.EmployeeDom;

public interface EmployeeService {

	public void createEmployee(EmployeeDom employeeDom);

	public EmployeeDom readEmployee(EmployeeDom employeeDom);

	public void updateEmployee(EmployeeDom employeeDom);

	public void deleteEmployee(EmployeeDom employeeDom);

	public List<EmployeeDom> getAllEmployee();
}
