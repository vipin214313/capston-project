package com.example.travelbooking.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;
    @Column(name = "passenger_name", nullable = false)
    private String passengerName;
    @Column(name = "booking_date")
    private java.sql.Timestamp bookingDate = new java.sql.Timestamp(System.currentTimeMillis());
}
