package com.userservice.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.userservice.model.Rating;

@FeignClient("RATING-SERVICE")
public interface RatingService {
	
	//post
	@PostMapping("/ratings")
	public Rating createRating(Rating ratings);
	//put
	@PutMapping("/ratings/{ratingId}")
	public Rating updateUser(@PathVariable String ratingId,Rating rating);
	
}
