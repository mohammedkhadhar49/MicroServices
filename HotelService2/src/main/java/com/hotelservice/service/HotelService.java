package com.hotelservice.service;

import java.util.List;

import com.hotelservice.model.Hotel;

public interface HotelService {
	
	public Hotel getOneHotel(String id);
	
	public List<Hotel> getAllHotels();
	
	public Hotel saveHotel(Hotel hotel);
}
