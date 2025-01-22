package com.msci.fight_booking_service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class FlightBookingController {

    @Autowired
    FlightSearchProxy flightSearchProxy;

    @PostMapping("/booking")
    public String bookAFlight(@RequestBody Flight flight){
        System.out.println("Flight to book " + flight);

        // FEtch flight from other service * quantity

        // Rest template to call "http://localhost:9090/api/v1/flights"
        RestTemplate restTemplate = new RestTemplate();
        // send map parameters
        Map<String, String> params = new HashMap<>();
        params.put("source", flight.getSource());
        params.put("destination", flight.getDestination());
        // ResponseEntity<Flight[]> responseEntity = restTemplate.getForEntity("http://localhost:9090/api/v1/flights?flightNumber={flightNumber}", Flight[].class, params);

        Flight flightResponse = restTemplate.getForObject("http://localhost:9090/api/v1/flights/{source}/to/{destination}", Flight.class, params);
        System.out.println(flightResponse);
        double totalPrice =  flight.getQuantity() * flightResponse.getPrice();


        return "Booked for " + totalPrice;


    }


    @PostMapping("/withfeign")
    public String bookAFlightWithFeign(@RequestBody Flight flight){
        System.out.println("Flight to book " + flight);

        // Declarative REST API Call 
        Flight flightResponse = flightSearchProxy.findFlight(flight.getSource(), flight.getDestination());  
        double totalPrice =  flight.getQuantity() * flightResponse.getPrice();

        return "Booked for " + totalPrice;


    }
    
}
