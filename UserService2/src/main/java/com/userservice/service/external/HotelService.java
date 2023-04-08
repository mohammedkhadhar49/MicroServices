package com.userservice.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userservice.model.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
	@GetMapping("/hotels/{hotelId}")
	Hotel getHotel(@PathVariable("hotelId") int hotelId);
}
