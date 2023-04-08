package com.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.userservice.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//@ExceptionHandler(UserNotFoundException.class)
	//public ResponseEntity<ApiResponse> userNotFoundWithId(UserNotFoundException userNot){
		//String message = userNot.getMessage();
		//ApiResponse apiResponse = ApiResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND).build();
		//return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	
}
