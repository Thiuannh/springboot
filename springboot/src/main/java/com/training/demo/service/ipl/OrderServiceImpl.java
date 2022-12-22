package com.training.demo.service.ipl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.Exception.NotFountException;
import com.training.demo.ackResponse.AckRespone;
import com.training.demo.entities.Order;
import com.training.demo.entities.User;
import com.training.demo.repositories.OrdeRepositories;
import com.training.demo.repositories.UserRepositories;
import com.training.demo.service.OrderService;



@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrdeRepositories ordeRepositories;
	
	@Autowired
	UserRepositories userRepositories;

	@Override
	public AckRespone CreateOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		for(Order order : orders) {
			Integer idInteger = order.getUser().getId();
			User user = userRepositories.findById(idInteger).get();
			if(user == null) {
				
				throw new NotFountException(idInteger + "Not found");
			}
			else {
				ordeRepositories.save(order);
			}
		}
		
		AckRespone ackRespone = new AckRespone();
		ackRespone.setCode("resource.created.code");
		ackRespone.setStatus("200");
		ackRespone.setReason("add List User");
		ackRespone.setContent(orders);
		
		return ackRespone;
		
		
	}

}
