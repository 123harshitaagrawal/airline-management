package com.example.airlinemanagement.service;

import com.example.airlinemanagement.model.Flight;
import com.example.airlinemanagement.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlightsSortedByDepartureTime() {
        return flightRepository.findAllByOrderByDepartureTimeAsc();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}