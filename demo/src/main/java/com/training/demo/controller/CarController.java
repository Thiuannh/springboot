package com.training.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.DTO.CarDTO;
import com.training.demo.entities.Car;
import com.training.demo.service.CarService;
import com.training.demo.utils.CarId;


@Controller
@RequestMapping("api")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/addnewCar", method = RequestMethod.GET)
	public String addCar(Model model) {
		CarDTO carDTO = new CarDTO();
				
		model.addAttribute("car", carDTO); 
		return "banner";
	}
	
	@RequestMapping(value = "/addnewCar", method = RequestMethod.POST)
	public String doAddCar(@ModelAttribute("car") CarDTO carDTO) {
		
		LocalDate localDate = LocalDate.parse(carDTO.getRepair_date());
	

		
		CarId carId = new CarId(carDTO.getLicense_plate(), localDate);
		
		Car car = new Car();
		
		car.setId(carId);
		car.setCustomerName(carDTO.getCustomerName());
		car.setCatalogs(carDTO.getCatalogs());
		car.setCarMaker(carDTO.getCarMaker());
		
		carService.createCar(car);
		
				
		return "banner";
		
	}
	

}
