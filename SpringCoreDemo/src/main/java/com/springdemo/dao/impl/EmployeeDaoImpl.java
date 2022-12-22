/**
 * 
 */
package com.springdemo.dao.impl;

import com.springdemo.bean.Employee;
import com.springdemo.dao.EmployeeDao;

/**
 * @author hoabt2
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(Employee employee) {
		System.out.println("Create emp: " + employee);		
	}
}
