package com.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.userservice.model.Rating;
import com.userservice.service.external.RatingService;

@SpringBootTest
@Service
class UserService2ApplicationTests {
	@Autowired
public RatingService ratingService;
	
	@Test
	void contextLoads() {
	}
	@Test
     void createRating() {
	Rating ratings = new Rating();
	ratings.setUserId("3");
	ratings.setRatingId("102");
	ratings.setRating(8);
	ratings.setHotelId(2);
	ratings.setFeedBack("good");
	
Rating r =	ratingService.createRating(ratings);
	System.out.println("new rating created ");
	
}
}
