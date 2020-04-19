package com.amsidh.spring.tutorial.domain;

import com.amsidh.spring.tutorial.annotations.Loggable;

public class Employee {

	private Integer employeeId;
	
	private String employeeName;
	private String address;

	@Loggable
	public Integer getEmployeeId() {
		return employeeId;
	}

	@Loggable
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Loggable
	public String getEmployeeName() {
		return employeeName;
	}
	@Loggable
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Loggable
	public String getAddress() {
		return address;
	}
	@Loggable
	public void setAddress(String address) {
		this.address = address;
	}

}
