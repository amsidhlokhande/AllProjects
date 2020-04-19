/**
 * 
 */
package com.amsidh.mvc.util;

import com.amsidh.mvc.dom.EmployeeDom;
import com.amsidh.mvc.dto.Employee;

/**
 * @author VIRU
 * 
 */
public class DomToDto {
	public static EmployeeDom getEmployeeDom(Employee employee) {
		return new EmployeeDom(employee.getEmployeeCode(),
				employee.getEmployeeName(), employee.getSalary());
	}
}
