package com.training.mvc.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserDTO {
	
	@NotEmpty(message = "{Employee.userName}")
    private String userName;


    @Email(message = "{Employee.email}")
    private String email;
    
    
    @NotEmpty(message = "{Employee.password}")
    private String password;
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
