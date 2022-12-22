/**
 * 
 */
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.demo.beans.User;

/**
 * @author hoabt2
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public ModelAndView login(Model model) {
		System.out.println("login();;;;;;;;;");
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("msg", "hello Spring MVC");
		return mv;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String login1(Model model) {			
		System.out.println("doLogin();;;;;;;;;");		
		//System.out.println("User = " + user);
		User u = new User();
		u.setUsername("an");
		u.setEmail("an@gmail.com");
		model.addAttribute("user", null);
		return "login";
	}
	
	
	@GetMapping("/user-details")
	public ModelAndView goToUserDetails() {
		ModelAndView mv = new ModelAndView("user-details");
		User u = new User();
		u.setUsername("an");
		u.setEmail("an@gmail.com");
		mv.addObject("user", u);
		return mv;
	}
}
