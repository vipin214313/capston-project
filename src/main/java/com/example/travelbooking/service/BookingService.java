package com.example.travelbooking.service;



import com.example.travelbooking.model.Booking;
import com.example.travelbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookFlight(Booking booking) {
        return bookingRepository.save(booking);
    }
}
