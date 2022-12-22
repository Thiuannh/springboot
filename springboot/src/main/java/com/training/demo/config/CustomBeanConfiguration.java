package com.training.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.demo.DTO.UserDTO;
import com.training.demo.entities.User;

@Configuration
public class CustomBeanConfiguration {
	
	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		TypeMap<UserDTO, User> propertyMapper = modelMapper.createTypeMap(UserDTO.class, User.class);
	    propertyMapper.addMappings(mapper -> mapper.skip(User::setId));
		return modelMapper;
	}
	


}
