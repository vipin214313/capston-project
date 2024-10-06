package com.example.travelbooking.repository;



import com.example.travelbooking.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {}
