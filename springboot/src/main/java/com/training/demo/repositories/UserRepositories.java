package com.training.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.User;


@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
	
	Long countByUserName(String UserName);
	Long countByUserNameOrEmailIgnoreCase(String UserName, String Email);
	
//	 @Query("select u from User u where u.userName = ?1")
	 User findByuserName(String userName);
	 
	

}
