package com.training.demo.service.ipl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.demo.Exception.NotFountException;
import com.training.demo.entities.CustomUserDetails;
import com.training.demo.entities.User;
import com.training.demo.repositories.RoleRepositories;
import com.training.demo.repositories.UserRepositories;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepositories userRepositories;
	
	@Autowired
	private RoleRepositories roleRepositories;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepositories.findByuserName(username);
	
		if(user == null) {
			throw new NotFountException(username + "User not found!");
		}
		
		List<String> roleNames = roleRepositories.findRoleNameByUserName(username);
		
		System.out.println(roleNames);
		
		
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		if (roleNames != null) {
			for (String role : roleNames) {
				// ROLE_USER, ROLE_ADMIN,..
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grantList.add(authority);
			}
		}
		UserDetails userDetails = (UserDetails) new CustomUserDetails(user.getUserName(), user.getPassword(), grantList);
		
		return userDetails;

	}
	
	
	
	

	
	

}
