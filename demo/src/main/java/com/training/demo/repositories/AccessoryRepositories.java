package com.training.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Accessory;

@Repository
public interface AccessoryRepositories extends JpaRepository<Accessory, Integer>{

}
