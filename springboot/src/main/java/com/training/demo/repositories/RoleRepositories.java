package com.training.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Role;


@Repository
public interface RoleRepositories extends JpaRepository<Role, Integer> {
	
	@Query("SELECT r.roleName FROM Role r JOIN r.userRoles ur JOIN ur.user u WHERE u.userName = ?1")
	List<String> findRoleNameByUserName(String UserName);

}
