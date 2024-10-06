package com.example.travelbooking.model;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "flight_number", nullable = false, unique = true)
    private String flightNumber;
    @Column(name = "source", nullable = false)
    private String source;
    @Column(name = "destination", nullable = false)
    private String destination;
    @Column(name = "price", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;
}
