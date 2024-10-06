package com.example.travelbooking.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "airlines")
@Data
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "airline_name", nullable = false, unique = true)
    private String airlineName;
}
