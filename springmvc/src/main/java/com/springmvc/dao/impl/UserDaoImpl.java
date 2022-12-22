/**
 * 
 */
package com.springmvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.springmvc.dao.UserDao;

/**
 * @author hoabt2
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String getUserInfo() {		
		return "Hello User Info";
	}

}
