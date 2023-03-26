package com.hotelservice.exception;

public class HotelNotFound extends RuntimeException{
	public HotelNotFound() {
		super("hotel not found !!");
	}
	public HotelNotFound(String s) {
		super(s);
	}
}
