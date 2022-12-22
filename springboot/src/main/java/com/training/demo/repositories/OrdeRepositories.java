package com.training.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Order;
import com.training.demo.entities.Role;

@Repository
public interface OrdeRepositories extends JpaRepository<Order, Integer> {
	
	
	

}
