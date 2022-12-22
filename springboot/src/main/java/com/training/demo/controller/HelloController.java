package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entities.User;
import com.training.demo.repositories.UserRepositories;

@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String Hello() {
		return "index";
	}
	
}
