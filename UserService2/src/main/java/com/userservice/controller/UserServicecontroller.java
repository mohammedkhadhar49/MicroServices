package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.model.User;
import com.userservice.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserServicecontroller {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user){
		
		User user1 = userServiceImpl.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	// get singl user with userID
	@GetMapping("/{userId}")
	public ResponseEntity<User> getById(@PathVariable String userId){
		User user = userServiceImpl.getUser(userId);
		return ResponseEntity.ok(user);
		
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUsers = userServiceImpl.findAllUser();
		return ResponseEntity.ok(allUsers);
	}
	
}
