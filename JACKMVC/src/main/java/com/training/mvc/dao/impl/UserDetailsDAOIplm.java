package com.training.mvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.mvc.dao.UserDetailsDAO;
import com.training.mvc.entities.UserDetails;

@Repository
public class UserDetailsDAOIplm implements UserDetailsDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createUserDetail(UserDetails userDetails) {
		// TODO Auto-generated method stub
		try(Session session = sessionFactory.openSession();) {
			session.save(userDetails);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
