package com.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	

	//User findById(@Param(value = "hotelId") String userId);
	

}
