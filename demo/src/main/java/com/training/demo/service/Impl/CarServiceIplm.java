package com.training.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Car;
import com.training.demo.repositories.CarRepositories;
import com.training.demo.service.CarService;

@Service
public class CarServiceIplm implements CarService {
	
	@Autowired
	private CarRepositories carRepositories;

	@Override
	public void createCar(Car car) {
		// TODO Auto-generated method stub
		carRepositories.save(car);
		
	}

}
