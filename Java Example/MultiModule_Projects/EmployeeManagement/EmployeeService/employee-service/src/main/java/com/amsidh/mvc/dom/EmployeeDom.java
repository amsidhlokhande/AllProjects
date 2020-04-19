/**
 * 
 */
package com.amsidh.mvc.dom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeDom {
	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_CODE")
	private Integer employeeCode;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	@Column(name = "SALARY")
	private Integer salary;

	public EmployeeDom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDom(Integer employeeCode, String employeeName, Integer salary) {
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
