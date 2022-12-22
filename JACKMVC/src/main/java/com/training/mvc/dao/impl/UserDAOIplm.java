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

import com.training.mvc.entities.User;


@Repository
public class UserDAOIplm implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	 public void SaveEmployee(User user) {
		 Session session = sessionFactory.openSession();
	     session.save(user);
	    }
	 
	 public User findbyUserNameAndPassword(User user) {
		 try {
			 Session session = sessionFactory.openSession();
			 String HQL = "FROM User E WHERE E.userName = :userName AND E.password = :password";
			 Query<User> query = session.createQuery(HQL);
			 query.setParameter("userName", user.getUserName()).setParameter("password", user.getPassword());
			 return  query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 return null;
		 
		
	}

	@Override
	public User findbyUserName(String userName) {
		// TODO Auto-generated method stub
		try(Session session = sessionFactory.openSession();) {
			String HQL = "FROM User U WHERE U.userName = :userName";
			Query<User> query = session.createQuery(HQL);
			query.setParameter("userName", userName);
			return query.getSingleResult();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	 
	 
}
