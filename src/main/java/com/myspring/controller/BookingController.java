package com.myspring.controller;

import com.myspring.model.Booking;
import com.myspring.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@AllArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }
    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
        try{
            List<Booking> result = bookingService.createBooking(booking);
            return ResponseEntity.ok(result);
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (IllegalStateException e){
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }
}
