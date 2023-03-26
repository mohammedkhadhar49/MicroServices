package com.ratingservice.service;

import java.util.List;

import com.ratingservice.model.RatingModel;

public interface RatingService {

	public RatingModel getOneRating(String ratingId);
	
	public RatingModel addRatingModel(RatingModel ratingModel);
	
	public List<RatingModel> getAllRatings() ;
	
	public List<RatingModel> getByUserId(Integer userId);
	
	public List<RatingModel> getByHotelId(String hotelId);
}
