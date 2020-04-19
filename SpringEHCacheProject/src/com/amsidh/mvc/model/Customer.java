/**
 * 
 */
package com.amsidh.mvc.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author amsidhlokhande
 * 
 */
@Component
@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@GenericGenerator(name = "myGenerator", strategy = "hilo")
	@GeneratedValue(generator = "myGenerator", strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMERID")
	private Integer customerId;

	@Column(name = "CUSTOMERNAME")
	private String customerName;

	@Embedded
	private Address address;

	public Customer() {

	}

	public Customer(Integer customerId, String customerName, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
