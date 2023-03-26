package com.hotelservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotelservice.exception.HotelNotFound;
import com.hotelservice.model.ApiBuilder;

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(HotelNotFound.class)
	public ResponseEntity<ApiBuilder> exceptionOcuurGetHotel(HotelNotFound hotelNotFound){
		String message = hotelNotFound.getMessage();
		//ApiBuilder builder = ApiBuilder.builder().status(HttpStatus.NOT_FOUND).success(false).message(message).build();
	//	return new ResponseEntity<ApiBuilder>(builder, HttpStatus.NOT_FOUND);
		return null;
		
	}
}
