package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entities.Accessory;
import com.training.demo.service.AccessoryService;
import com.training.demo.utils.CarId;

@RestController
@RequestMapping("api")
public class AccessoryController {
	
	@Autowired
	private AccessoryService accessoryService;
	
	@PostMapping(value = "/addAccessory", params = "carID")
	public void addAccessory(@RequestBody Accessory accessory, @RequestParam("carID") String carId) throws Exception {
//		accessoryService.createAccessoryService(accessory, carId);
		System.out.println(carId);
		
		
	}

}
