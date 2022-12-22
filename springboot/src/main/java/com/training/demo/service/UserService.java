package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.User;



public interface UserService {
	
	void createUser(User user);
	
	List<User> ReadUsers();
	
	Optional<User> ReadById(Integer id);
	
	boolean deleteUser(Integer id);
	
	boolean updateUser(Integer id, User user);
	
	AckRespone CreateList(List<User> users);
	
	
	
	

}
