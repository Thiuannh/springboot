/**
 * 
 */
package com.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.service.UserService;

/**
 * @author hoabt2
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public String getUserInfo() {		
		return userDao.getUserInfo();
	}
}
