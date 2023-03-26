package com.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingservice.model.RatingModel;

public interface RatingsRepository extends JpaRepository<RatingModel, String>{

	//cutom methods
	
	List<RatingModel> findByUserId(Integer userId);
	 List<RatingModel> findByHotelId(String hotelId);
	 
}
