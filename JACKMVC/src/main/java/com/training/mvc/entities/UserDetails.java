package com.training.mvc.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "UserDetail", schema = "dbo")
public class UserDetails {
	
	@Id
	@Column(name = "UserDetilId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firsName;
	
	private String lastName;
	
	private Integer phone;
	
	private String description;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", unique = true)
	private User user;

	public UserDetails(String firsName, String lastName, Integer phone, String description, User user) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.phone = phone;
		this.description = description;
		this.user = user;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
