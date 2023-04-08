package com.userservice.serviceimpl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.userservice.exception.UserNotFoundException;
import com.userservice.model.Hotel;
import com.userservice.model.Rating;
import com.userservice.model.User;
import com.userservice.repository.UserRepository;
import com.userservice.service.UserService;
import com.userservice.service.external.HotelService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Autowired
	RestTemplate restemTemplate;
	 
	@Autowired
	HotelService hotelService;
	//	@Autowired
	//	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<User> findAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {

		System.out.println(userId);
		User user = userRepository.findById(Integer.parseInt(userId)).orElseThrow(()-> new UserNotFoundException("User not found!!"));

		//fetch rating of the above user from rating service 
		//http://localhost:8083/ratings/users/3
	 Rating[] userRatings =	restemTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+userId, Rating[].class);
		System.out.println("userRatings "+userRatings);
		List<Rating> ratings  = Arrays.stream(userRatings).toList();
		 //user.setRatings(userRatings);
		

		List<Rating> ratingList =	ratings.stream().map(rating->{
			//api call to hotel service to get the hotel
		//	ResponseEntity<Hotel> hotelEntity =	restemTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
			Hotel hotel =	hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());

		user.setRatings(ratingList);	

		return	user;
	}

	@Override
	public User saveUser(User user) {
		
		//String uId = UUID.randomUUID().toString();
		//user.setUserId(uId);
		return userRepository.save(user);
		
	}

}	
