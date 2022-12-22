package com.training.mvc.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.mvc.dao.UserDAO;
import com.training.mvc.entities.Employee;


@Repository
public class UserDAOIplm implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public void SaveEmployee(Employee employee) {
		 Session session = sessionFactory.openSession();
	     session.save(employee);
	    }
}
