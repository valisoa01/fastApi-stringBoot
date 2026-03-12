package com.myspring.service;

import com.myspring.model.Booking;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    private final List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Booking> createBooking(Booking booking) {

        int roomNumber = booking.getRoom().getRoomNumber();

        if (roomNumber < 1 || roomNumber > 9) {
            throw new IllegalArgumentException("Room number must be between 1 and 9");
        }

        for (Booking b : bookings) {
            if (b.getRoom().getRoomNumber() == roomNumber && b.getBookingDate().equals(booking.getBookingDate())) {

                throw new IllegalStateException("Room already booked for this date");
            }
        }
        bookings.add(booking);

        return bookings;
    }
}
