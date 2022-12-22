package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.bean.Employee;
import com.springdemo.dao.EmployeeDao;
import com.springdemo.dao.impl.EmployeeDaoImpl;
import com.springdemo.service.EmployeeService;
import com.springdemo.service.impl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee) ctx.getBean("employee");		
		
		//EmployeeService empService = (EmployeeService)ctx.getBean(EmployeeServiceImpl.class);
		
		//empService.createEmployee(emp);
		System.out.println(emp);
		
	}
}
