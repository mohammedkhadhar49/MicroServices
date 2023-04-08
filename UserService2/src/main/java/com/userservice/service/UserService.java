package com.userservice.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import com.userservice.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> findAllUser();
	
	public User getUser(String userId) throws UserPrincipalNotFoundException;
	
}
