package com.training.demo.service;

import com.training.demo.entities.Accessory;
import com.training.demo.entities.Car;
import com.training.demo.utils.CarId;

public interface AccessoryService {
	
	void createAccessoryService(Accessory accessory, CarId carId) throws Exception;

}
