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
public class DtoToDom {
	public static Employee getEmployeeDto(EmployeeDom employeeDom) {
		return new Employee(employeeDom.getEmployeeCode(),
				employeeDom.getEmployeeName(), employeeDom.getSalary());
	}
}
