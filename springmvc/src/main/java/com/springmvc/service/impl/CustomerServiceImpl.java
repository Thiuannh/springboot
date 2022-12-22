/**
 * 
 */
package com.springmvc.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.CustomerDao;
import com.springmvc.entities.Customer;
import com.springmvc.service.CustomerService;

/**
 * @author hoabt2
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public void saveCustomer(Customer customer) {
		customerDao.create(customer);		
	}
}
