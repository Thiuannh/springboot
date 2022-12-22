package com.training.mvc.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.mvc.dao.ContentDAO;
import com.training.mvc.entities.Content;
import com.training.mvc.entities.User;

@Repository
public class ContentDAOIplm implements ContentDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createContent(Content content) {
		// TODO Auto-generated method stub
		try(Session session = sessionFactory.openSession();) {
			session.save(content);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Content> getAll() {
		// TODO Auto-generated method stub
		try(Session session = sessionFactory.openSession();) {
			String HQL = "FROM Content";
			return session.createQuery(HQL).getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<Content> findByUser(User user) {
		// TODO Auto-generated method stub
		try(Session session = sessionFactory.openSession();) {
			String HQL = "SELECT C FROM Content C JOIN C.user U WHERE U.userName = :userName";
			Query<Content> query = session.createQuery(HQL).setParameter("userName", user.getUserName());
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return Collections.EMPTY_LIST;
		
		
	}

}
