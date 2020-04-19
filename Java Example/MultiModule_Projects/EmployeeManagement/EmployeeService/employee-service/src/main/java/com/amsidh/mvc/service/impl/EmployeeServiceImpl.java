/**
 * 
 */
package com.amsidh.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amsidh.mvc.dao.EmployeeDao;
import com.amsidh.mvc.dto.Employee;
import com.amsidh.mvc.service.EmployeeService;

/**
 * @author VIRU
 * 
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.mvc.service.EmployeeService#addEmployee(com.amsidh.mvc.dto
	 * .Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.mvc.service.EmployeeService#getEmployeeByEmployeeCode(java
	 * .lang.Integer)
	 */
	@Override
	public Employee getEmployeeByEmployeeCode(Integer employeeCode) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByEmployeeCode(employeeCode);
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
