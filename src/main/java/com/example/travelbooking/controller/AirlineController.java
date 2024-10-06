package com.example.travelbooking.controller;



import com.example.travelbooking.model.Airline;
import com.example.travelbooking.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airlines")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineService.getAllAirlines();
    }

    @PostMapping
    public Airline addAirline(@RequestBody Airline airline) {
        return airlineService.addAirline(airline);
    }
}
