package com.amsidh.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amsidh.mvc.doms.EmployeeDom;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private static List<EmployeeDom> listOfEmployee = new ArrayList<EmployeeDom>();
	static {
		listOfEmployee.add(new EmployeeDom(123, "Amsidh Lokhande", "Pune",
				new Long(8108551845L)));
		listOfEmployee.add(new EmployeeDom(12345, "Raju Lokhande", "Bijapur",
				new Long(845791258L)));
	}
	
	

	public EmployeeServiceImpl() {
		//System.out.println("EmployeeServiceImpl is loading..........");
	}

	@Override
	public void createEmployee(EmployeeDom employeeDom) {
		// TODO Auto-generated method stub

		listOfEmployee.add(employeeDom);
	}

	@Override
	public EmployeeDom readEmployee(EmployeeDom employeeDom) {

		for (EmployeeDom employee : listOfEmployee) {
			if (employeeDom.getEmployeeId().equals(employee.getEmployeeId())) {
				employeeDom = employee;
			} else {
				employeeDom = new EmployeeDom();
			}
		}
		return employeeDom;
	}

	@Override
	public void updateEmployee(EmployeeDom employeeDom) {

	}

	@Override
	public void deleteEmployee(EmployeeDom employeeDom) {
		listOfEmployee.remove(employeeDom);
	}

	@Override
	public List<EmployeeDom> getAllEmployee() {
		// TODO Auto-generated method stub
		return listOfEmployee;
	}

}
