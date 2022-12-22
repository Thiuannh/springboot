package com.training.mvc.dao;


import com.training.mvc.entities.User;

public interface UserDAO {
	
	void SaveEmployee(User user);
	
	User findbyUserNameAndPassword(User user);
	
	User findbyUserName(String userName);
	
	
}
