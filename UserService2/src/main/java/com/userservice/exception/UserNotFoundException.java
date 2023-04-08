package com.userservice.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(){
		super("user Not Found!.. ");
	}
	public UserNotFoundException(String userNotFound){
		super(userNotFound);
	}
}
