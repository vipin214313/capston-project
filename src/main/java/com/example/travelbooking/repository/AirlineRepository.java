package com.example.travelbooking.repository;



import com.example.travelbooking.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Long> {}
