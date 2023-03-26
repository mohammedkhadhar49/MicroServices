package com.hotelservice.controller;

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

import com.hotelservice.model.Hotel;
import com.hotelservice.serviceimpl.HotelServiceImpl;
@RestController
@RequestMapping("/hotels")
public class HotelServiceController {
	@Autowired
	private HotelServiceImpl hotelServiceImpl;
	@PostMapping
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		
		Hotel hotels = hotelServiceImpl.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotels);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getOneHotelData(@PathVariable String id){
		Hotel hotel = hotelServiceImpl.getOneHotel(id);
		return ResponseEntity.ok(hotel);
	}
	@GetMapping
	public ResponseEntity<List<Hotel>> allHotels(){
		List<Hotel> hotel = hotelServiceImpl.getAllHotels();
		return ResponseEntity.status(HttpStatus.FOUND).body(hotel);
	}
}
