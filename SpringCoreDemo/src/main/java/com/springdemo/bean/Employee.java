/**
 * 
 */
package com.springdemo.bean;

/**
 * @author hoabt2
 *
 */
public class Employee {
	
	private String fullName;
	private String email;	
	
	private Address address;
	
	private Address address2;	
	
	
	public Employee(String email, Address address, Address address2) {
		super();
		this.email = email;
		this.address = address;		
		this.address2 = address2;
	}

	public Address getAddress2() {
		return address2;
	}

	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		System.out.println("Employee Default Constructor");
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", email=" + email + ", address=" + address + ", address2=" + address2
				+ "]";
	}	
}
