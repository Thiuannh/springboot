/**
 * 
 */
package com.springdemo.service.impl;

import com.springdemo.bean.Employee;
import com.springdemo.dao.EmployeeDao;
import com.springdemo.service.EmployeeService;

/**
 * @author hoabt2
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public void createEmployee(Employee employee) {
		System.out.println("Create Employee from EmployeeService...");	
		employeeDao.create(employee);
	}
}
