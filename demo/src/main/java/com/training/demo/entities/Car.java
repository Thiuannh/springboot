package com.training.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.training.demo.utils.CarId;

@Entity
@Table(name = "car", schema = "dbo")
public class Car {
	
	@EmbeddedId
	private CarId id;
	
	private String customerName;
	
	private String catalogs;
	
	private String carMaker;
	
	@OneToMany(mappedBy = "car", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Accessory> accessories;

	public Car(CarId id, String customerName, String catalogs, String carMaker) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.catalogs = catalogs;
		this.carMaker = carMaker;
	}
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarId getId() {
		return id;
	}



	public void setId(CarId id) {
		this.id = id;
	}



	public List<Accessory> getAccessories() {
		return accessories;
	}



	public void setAccessories(List<Accessory> accessories) {
		this.accessories = accessories;
	}



	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(String catalogs) {
		this.catalogs = catalogs;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	
}
