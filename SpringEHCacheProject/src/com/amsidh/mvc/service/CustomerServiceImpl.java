/**
 * 
 */
package com.amsidh.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.model.Customer;

/**
 * @author amsidhlokhande
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.CustomerService#addCustomer(com.amsidh.mvc.model.Customer)
	 */
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.CustomerService#updateCustomer(com.amsidh.mvc.model.Customer)
	 */
	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.CustomerService#deleteCustomer(java.lang.Integer)
	 */
	@Override
	public boolean deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.CustomerService#getCustomerByCustomerId(java.lang.Integer)
	 */
	@Override
	public Customer getCustomerByCustomerId(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.amsidh.mvc.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
