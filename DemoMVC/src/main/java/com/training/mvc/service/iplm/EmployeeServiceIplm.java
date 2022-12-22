package com.training.mvc.service.iplm;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.training.mvc.dao.UserDAO;
import com.training.mvc.dao.impl.UserDAOIplm;
import com.training.mvc.entities.Employee;
import com.training.mvc.service.EmployeeService;

@Service
public class EmployeeServiceIplm implements EmployeeService {
	
	@Autowired
	private UserDAO UserDAO;
	@Transactional
	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		UserDAO.SaveEmployee(employee);
		
	}
		
}
