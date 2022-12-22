package com.training.demo.utils;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class CarId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String license_plate;
	
	private LocalDate repair_date;

	public CarId(String license_plate, LocalDate repair_date) {
		super();
		this.license_plate = license_plate;
		this.repair_date = repair_date;
	}

	public CarId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public LocalDate getRepair_date() {
		return repair_date;
	}

	public void setRepair_date(LocalDate repair_date) {
		this.repair_date = repair_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((license_plate == null) ? 0 : license_plate.hashCode());
		result = prime * result + ((repair_date == null) ? 0 : repair_date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarId other = (CarId) obj;
		if (license_plate == null) {
			if (other.license_plate != null)
				return false;
		} else if (!license_plate.equals(other.license_plate))
			return false;
		if (repair_date == null) {
			if (other.repair_date != null)
				return false;
		} else if (!repair_date.equals(other.repair_date))
			return false;
		return true;
	}
	
	

}
