package com.example.travelbooking.controller;

import com.example.travelbooking.model.Booking;
import com.example.travelbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookFlight(@RequestBody Booking booking) {
        return bookingService.bookFlight(booking);
    }
}
