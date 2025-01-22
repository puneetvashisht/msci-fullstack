package com.msci.fight_booking_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "fight-search-service")
public interface FlightSearchProxy {

    @GetMapping("/api/v1/flights/{source}/to/{destination}")
     Flight findFlight(@PathVariable("source") String source, @PathVariable("destination")String destination);
}