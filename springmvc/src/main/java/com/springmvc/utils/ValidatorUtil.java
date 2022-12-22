/**
 * 
 */
package com.springmvc.utils;

import org.springframework.stereotype.Component;

/**
 * @author hoabt2
 *
 */
@Component
public class ValidatorUtil {
	
	/**
	 * @param email
	 * @return
	 */
	public boolean isEmail(String email) {
		if (email == null || email.isEmpty()) {
			return false;
		}
		return true;
	}
}
