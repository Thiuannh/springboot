package com.training.mvc.service.iplm;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.training.mvc.dao.UserDAO;
import com.training.mvc.dao.impl.UserDAOIplm;

import com.training.mvc.entities.User;
import com.training.mvc.service.EmployeeService;

@Service
public class EmployeeServiceIplm implements EmployeeService {
	
	@Autowired
	private UserDAO userDAO;
	
	
	
	
	@Override
	public void createEmployee(User user) {
		// TODO Auto-generated method stub
		userDAO.SaveEmployee(user);
		
	}
	
	@Override
	public User login(User user) {
		
		return userDAO.findbyUserNameAndPassword(user);
		
	}	
}
