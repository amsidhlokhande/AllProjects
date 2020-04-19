package com.dineshonjava.web.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dinesh Rajput
 *
 */
@XmlRootElement(name="employees")
@XmlAccessorType(XmlAccessType.NONE)
public class Employee {
	@XmlElement(name="empId")
	private Integer id;
	@XmlElement(name="empName")
	private String name;
	@XmlElement(name="empAge")
	private Integer age;
	@XmlElement(name="empSalary")
	private Long salary;
	@XmlElement(name="empAddress")
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
