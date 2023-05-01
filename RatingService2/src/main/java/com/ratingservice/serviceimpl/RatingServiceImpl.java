package com.ratingservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.model.RatingModel;
import com.ratingservice.repository.RatingsRepository;
import com.ratingservice.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingsRepository ratingsRepository;
	
	@Override
	public RatingModel getOneRating(String ratingId) {
		
		return null;
	}

	@Override
	public RatingModel addRatingModel(RatingModel ratingModel) {
		
		return ratingsRepository.save(ratingModel);
	}

	@Override
	public List<RatingModel> getAllRatings() {
		List<RatingModel> rating =  ratingsRepository.findAll();
		System.out.println("rates :: "+rating);
		return rating;
	}

	@Override
	public List<RatingModel> getByUserId(Integer userId) {
		
		return ratingsRepository.findByUserId(userId);
	}

	@Override
	public List<RatingModel> getByHotelId(String hotelId) {
		
		return ratingsRepository.findByHotelId(hotelId);
	}

}
