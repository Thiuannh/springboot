/**
 * 
 */
package com.springmvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.CustomerDao;
import com.springmvc.entities.Customer;

/**
 * @author hoabt2
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(Customer customer) {
		Session session = sessionFactory.openSession();
		session.save(customer);
	}
}
