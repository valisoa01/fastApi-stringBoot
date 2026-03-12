package com.myspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Booking {
    private Long id;
    private Customer customer;
    private Room room;
    private LocalDate bookingDate;
}
