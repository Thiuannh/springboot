package com.training.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Accessory", schema = "dbo")
public class Accessory {
	
	@Id
	@Column(name = "Accessory_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private String statusDamaged;
	
	private String repairStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Car car;

	public Accessory(Integer id, String name, Double price, String statusDamaged, String repairStatus, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.statusDamaged = statusDamaged;
		this.repairStatus = repairStatus;
		this.car = car;
	}

	public Accessory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatusDamaged() {
		return statusDamaged;
	}

	public void setStatusDamaged(String statusDamaged) {
		this.statusDamaged = statusDamaged;
	}

	public String getRepairStatus() {
		return repairStatus;
	}

	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
