package com.training.demo.DTO;

import java.time.LocalDate;

public class CarDTO {
	
	private String license_plate;
	
	private String  repair_date;
	
	private String customerName;
	
	private String catalogs;
	
	private String carMaker;

	public CarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarDTO(String license_plate, String repair_date, String customerName, String catalogs, String carMaker) {
		super();
		this.license_plate = license_plate;
		this.repair_date = repair_date;
		this.customerName = customerName;
		this.catalogs = catalogs;
		this.carMaker = carMaker;
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public String getRepair_date() {
		return repair_date;
	}

	public void setRepair_date(String repair_date) {
		this.repair_date = repair_date;
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
