package com.training.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Car;
import com.training.demo.utils.CarId;

@Repository
public interface CarRepositories extends JpaRepository<Car, CarId> {
	

}
