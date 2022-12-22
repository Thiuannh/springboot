package com.training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.Order;
import com.training.demo.service.OrderService;



@RestController
@RequestMapping("api/v1")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/ordes")
	public AckRespone createOrders(@RequestBody List<Order> orders) {
		return orderService.CreateOrders(orders);
	}

}
