package com.vehiclesim.vehiclesimserver.model;

import org.springframework.data.annotation.Id;

public class Vehicle {
    @Id
    private String id;

    private String make;
    private String model;
    private String year;
    private String color;
    private String vin;
    private String mileage;
    private String price;

    public Vehicle() {
    }

    public Vehicle(String make, String model, String year, String color, String vin, String mileage, String price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
        this.mileage = mileage;
        this.price = price;
    }
}
