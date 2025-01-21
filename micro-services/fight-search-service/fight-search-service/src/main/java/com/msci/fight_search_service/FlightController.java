package com.msci.fight_search_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @PostMapping("/flights")
    public void addFlight(@RequestBody Flight flight) {
        flightRepository.save(flight);
    }

    @GetMapping("/flights")
    public List<Flight> fetchAllFlights() {
        return  flightRepository.findAll();
    }

    @GetMapping("/flights/{source}/to/{destination}")
    public Flight searchFlights(@PathVariable String source, @PathVariable String destination) {
        return flightRepository.findBySourceAndDestination(source, destination);
    }
    
    
    
}
