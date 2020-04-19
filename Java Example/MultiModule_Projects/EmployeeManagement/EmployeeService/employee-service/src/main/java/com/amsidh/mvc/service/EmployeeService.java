/**
 * 
 */
package com.amsidh.mvc.service;

import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 * 
 */
public interface EmployeeService {
	public void addEmployee(Employee employee);

	public Employee getEmployeeByEmployeeCode(Integer employeeCode);
}
