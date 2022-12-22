package com.training.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.ackResponse.model.LoginRequest;
import com.training.demo.ackResponse.model.LoginResponse;
import com.training.demo.utils.JwtTokenUtil;



@RestController
@CrossOrigin
public class AuthenticationController extends BaseSecurityController {

	private static final Logger LOGGER = LogManager.getLogger(AuthenticationController.class);
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody LoginRequest loginRequest) throws Exception {

//		LOGGER.info("createAuthenticationToken():::::::::");
		
		authenticate(loginRequest.getUsername(), loginRequest.getPassword());

		final UserDetails userDetails = jwtInMemoryUserDetailsService.loadUserByUsername(loginRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new LoginResponse(token));
	}
	
//	@PostMapping("/signout")
//	  public ResponseEntity<?> logoutUser() {
//	    ResponseCookie cookie = jwtTokenUtil.getCleanJwtCookie();
//	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
//	        .body(new MessageResponse("You've been signed out!"));
//	  }

}
