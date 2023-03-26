package com.hotelservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.exception.HotelNotFound;
import com.hotelservice.hotelrepository.HotelRepository;
import com.hotelservice.model.Hotel;
import com.hotelservice.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel getOneHotel(String id) {
		
		return hotelRepository.findById(id).orElseThrow(()-> new HotelNotFound("Hotel Not found with id "+id));
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel saveHotel(Hotel hotel) {
		
		return hotelRepository.save(hotel);
	}
	
}
