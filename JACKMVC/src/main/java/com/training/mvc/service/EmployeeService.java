package com.training.mvc.service;

import com.training.mvc.entities.User;

public interface EmployeeService {
	
	void createEmployee(User user);
	
	User login(User user);

}
