package com.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.stereotype.Service;

import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.Order;
import com.training.demo.repositories.OrdeRepositories;


@Service
public interface OrderService {
	
	public AckRespone CreateOrders(List<Order> orders);
	

}
