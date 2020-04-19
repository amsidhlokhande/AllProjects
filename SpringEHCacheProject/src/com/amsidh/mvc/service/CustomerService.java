/**
 * 
 */
package com.amsidh.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.model.Customer;

/**
 * @author amsidhlokhande
 * 
 */
@Repository
public interface CustomerService {
	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(Integer customerId);

	public Customer getCustomerByCustomerId(Integer customerId);

	public List<Customer> getAllCustomers();
}
