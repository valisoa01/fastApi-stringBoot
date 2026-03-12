package com.myspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private  String phone;
    private String email;
}
