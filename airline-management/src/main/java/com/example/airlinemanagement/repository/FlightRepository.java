package com.example.airlinemanagement.repository;

import com.example.airlinemanagement.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByOrderByDepartureTimeAsc();
}