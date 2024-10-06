package com.example.travelbooking.service;



import com.example.travelbooking.model.Airline;
import com.example.travelbooking.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    public Airline addAirline(Airline airline) {
        return airlineRepository.save(airline);
    }
}
