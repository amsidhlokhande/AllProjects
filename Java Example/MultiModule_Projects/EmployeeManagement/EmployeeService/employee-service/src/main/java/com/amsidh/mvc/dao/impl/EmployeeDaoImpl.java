/**
 * 
 */
package com.amsidh.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dao.EmployeeDao;
import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 * 
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeByEmployeeCode(Integer employeeCode) {
		Employee employee = new Employee(123, "Amsidh Lokhande", 510000);
		return employee;
	}

}
