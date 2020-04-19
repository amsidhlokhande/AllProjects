/**
 * 
 */
package com.amsidh.mvc.dao;

import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 * 
 */
public interface EmployeeDao {
	public void addEmployee(Employee employee);

	public Employee getEmployeeByEmployeeCode(Integer employeeCode);

}
