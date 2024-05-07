package com.vehiclesim.vehiclesimserver.model;

import org.springframework.data.annotation.Id;

public class Vehicle {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String make;
    private String model;
    private String year;

    // private String color;
    // private String vin;
    // private String mileage;
    // private String price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Vehicle() {
    }

    public Vehicle(String id, String make, String model, String year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        // this.color = color;
        // this.vin = vin;
        // this.mileage = mileage;
        // this.price = price;
    }
}
