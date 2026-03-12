package com.myspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Room {
    private Long id;
    private int roomNumber;
    private String description;
}
