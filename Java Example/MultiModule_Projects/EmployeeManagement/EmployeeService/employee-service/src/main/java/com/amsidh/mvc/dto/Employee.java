/**
 * 
 */
package com.amsidh.mvc.dto;

/**
 * @author VIRU
 * 
 */
public class Employee {
	private Integer employeeCode;
	private String employeeName;
	private Integer salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeCode, String employeeName, Integer salary) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Integer getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Integer employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
