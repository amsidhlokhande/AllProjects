package com.amsidh.mvc.domain;

public class EmployeeDto {

	private Integer employeeId;
	private String empName;
	private String address;
	private Long contactNumber;

	
	public EmployeeDto() {
	
	}

	public EmployeeDto(Integer employeeId, String empName, String address,
			Long contactNumber) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

}
