package com.msci.fight_search_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
    Flight findBySourceAndDestination(String source, String destination);
} 
