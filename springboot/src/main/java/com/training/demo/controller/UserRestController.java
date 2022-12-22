package com.training.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Media;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.DTO.UserDTO;
import com.training.demo.Exception.NotFountException;
import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.User;
import com.training.demo.repositories.UserRepositories;
import com.training.demo.service.UserService;


@RestController
@RequestMapping("api/v1")
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
		// 
		List<User> users =  userService.ReadUsers();
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "List of users");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(users);
		
	}
	
	@PostMapping("/users")
	public AckRespone CreateUsers(@RequestBody List<User> users) {
		
		int a[] = new int[5];
		return userService.CreateList(users);
		
		
		
	}
	
	@GetMapping( value = "/users", params = "id", produces = {MediaType.APPLICATION_NDJSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Optional<User>> getUser(@RequestParam("id") String id) {
		
		Optional<User> user =  userService.ReadById(Integer.parseInt(id));
		if(user.isPresent()) {
			HttpHeaders headers = new HttpHeaders();
			headers.add("desc", "Getting user by id");
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(user);
			
		}
		
		throw new NotFountException("Id does not exist!");
		
	}
	
	@PostMapping("/user")
	public ResponseEntity<Void> create(@RequestBody UserDTO userDTO) {
		
//		ModelMapper modelMapper = new ModelMapper();
		
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
		
//		TypeMap<UserDTO, User> propertyMapper = modelMapper.createTypeMap(UserDTO.class, User.class);
//	    propertyMapper.addMappings(mapper -> mapper.skip(User::setId));
//	    
	    
	    User user = modelMapper.map(userDTO, User.class);
		
		
		
		
		userService.createUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "adding one user");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
				
	}
	
	@PutMapping("users/{id}")
	public ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable String id) {
		
		if(userService.updateUser(Integer.parseInt(id), user)) {
			return new ResponseEntity<>("successful", HttpStatus.ACCEPTED);
		}
		else {
			throw new NotFountException("Id does not exist!");
		}
		
	}
	
	@DeleteMapping(value = "/users", params = "id")
	public ResponseEntity<String> DeleteUser(@RequestParam("id") String id) {
		if(userService.deleteUser(Integer.parseInt(id))) {
			return new ResponseEntity<>("successful", HttpStatus.ACCEPTED);
		}
		else {
			throw new NotFountException("Id does not exist!");
		}
		
	}
}
