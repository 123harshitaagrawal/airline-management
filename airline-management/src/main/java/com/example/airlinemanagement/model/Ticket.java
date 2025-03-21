package com.example.airlinemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;
}