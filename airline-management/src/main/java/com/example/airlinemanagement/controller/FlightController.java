package com.example.airlinemanagement.controller;

import com.example.airlinemanagement.model.Flight;
import com.example.airlinemanagement.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort) {
        if ("asc".equals(sort)) {
            return flightService.getAllFlightsSortedByDepartureTime();
        }
        return flightService.getAllFlightsSortedByDepartureTime();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
}