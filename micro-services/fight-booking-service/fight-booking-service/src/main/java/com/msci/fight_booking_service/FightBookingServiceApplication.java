package com.msci.fight_booking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FightBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FightBookingServiceApplication.class, args);
	}

}
