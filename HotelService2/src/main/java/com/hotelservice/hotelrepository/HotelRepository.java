package com.hotelservice.hotelrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelservice.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
