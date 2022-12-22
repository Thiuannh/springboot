/**
 * 
 */
package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.entities.Customer;
import com.springmvc.service.CustomerService;
import com.springmvc.service.UserService;
import com.springmvc.utils.ValidatorUtil;

/**
 * @author hoabt2
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ValidatorUtil validator;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/user")
	public String helloUser() {
		//String msg = userService.getUserInfo();
		//System.out.println("User Info = " + msg);
		//System.out.println(validator.isEmail("abc"));
		Customer customer = new Customer("Tom Cruise");
		customerService.saveCustomer(customer);
		return "user-profile";
	}	
}
