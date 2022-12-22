package com.training.demo.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Accessory;
import com.training.demo.entities.Car;
import com.training.demo.repositories.AccessoryRepositories;
import com.training.demo.repositories.CarRepositories;
import com.training.demo.service.AccessoryService;
import com.training.demo.utils.CarId;


@Service
public class AccessoryServiceIplm implements AccessoryService {
	
	@Autowired
	private AccessoryRepositories accessoryRepositories;
	
	@Autowired
	private CarRepositories carRepositories;

	@Override
	public void createAccessoryService(Accessory accessory, CarId carId) throws Exception {
		
		// TODO Auto-generated method stub
		Optional<Car> carOptional = carRepositories.findById(carId);
		if(carOptional.isEmpty()) {
			throw new Exception("not found");
		}
		accessoryRepositories.save(accessory);
		
	}

	

}
