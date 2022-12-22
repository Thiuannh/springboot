package com.training.demo.service.ipl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.demo.Exception.NotFountException;
import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.User;
import com.training.demo.repositories.UserRepositories;
import com.training.demo.service.UserService;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepositories userRepositories;
	
	@Autowired
	Environment env;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		String pwEncode = 	passwordEncoder.encode(user.getPassword());
		user.setPassword(pwEncode);
		userRepositories.save(user);
		
	}
	
	

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> userdata = userRepositories.findById(id);
		if(userdata.isPresent()) {
			userRepositories.deleteById(id);
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updateUser(Integer id, User user) {
		// TODO Auto-generated method stub
		Optional<User> userdb = userRepositories.findById(id);
		
		if(userdb.isPresent()) {
			User userUpdate = userdb.get();
			userUpdate.setUserName(user.getUserName());
			userUpdate.setEmail(user.getEmail());
			userUpdate.setPassword(user.getPassword());
			userRepositories.save(userUpdate);
			return true;
		}
		
		return false;
//		else {
//			throw new IllegalArgumentException("User width id = " + id + "Not fond");
//		}
		
	}

	@Override
	public List<User> ReadUsers() {
		// TODO Auto-generated method stub
		return userRepositories.findAll();
	}

	@Override
	public Optional<User> ReadById(Integer id) {
		// TODO Auto-generated method stub
		return userRepositories.findById(id);
	}



	@Override
	public AckRespone CreateList(List<User> users) {
		// TODO Auto-generated method stub
		String pwEnCode = null;
		for(User user : users) {
			pwEnCode = passwordEncoder.encode(user.getPassword());
			user.setPassword(pwEnCode);
		}
		
		AckRespone ackRespone = new AckRespone();
		ackRespone.setCode(env.getProperty("resource.created.code"));
		ackRespone.setStatus("200");
		ackRespone.setReason("add List User");
		ackRespone.setContent(userRepositories.saveAll(users));
		
		return ackRespone;
		
	}
	
	
	
	
	
	
	
	
	
	


}
