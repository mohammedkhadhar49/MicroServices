package com.hotelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelService2Application {

	public static void main(String[] args) {
		SpringApplication.run(HotelService2Application.class, args);
	}

}
