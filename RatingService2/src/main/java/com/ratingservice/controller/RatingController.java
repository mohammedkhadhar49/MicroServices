package com.ratingservice.controller;

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

import com.ratingservice.model.RatingModel;
import com.ratingservice.serviceimpl.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	private RatingServiceImpl ratingServiceImpl;
	@GetMapping
	public ResponseEntity<List<RatingModel>> getAllRatings(){
		List<RatingModel> allRatings = ratingServiceImpl.getAllRatings();
		return ResponseEntity.status(HttpStatus.FOUND).body(allRatings);
	}
	@PostMapping
	public ResponseEntity<RatingModel> addRatingModel(@RequestBody RatingModel ratingModel){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.addRatingModel(ratingModel));
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<RatingModel>> getByUserId(@PathVariable Integer userId ){
		return ResponseEntity.ok(ratingServiceImpl.getByUserId(userId));
	}
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<RatingModel>> getByUserId(@PathVariable String hotelId ){
		return ResponseEntity.ok(ratingServiceImpl.getByHotelId(hotelId));
	}
	
}
