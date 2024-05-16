package com.vehiclesim.vehiclesimserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "VEHICLES")
public class Vehicle {

    @Id
    private Long id;

    private String vehicle_make;
    private String vehicle_model;
    private String vehicle_year;
    private String[] body_style;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicle_make() {
        return vehicle_make;
    }

    public void setVehicle_make(String make) {
        this.vehicle_make = make;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String model) {
        this.vehicle_model = model;
    }

    public String getVehicle_year() {
        return vehicle_year;
    }

    public void setVehicle_year(String year) {
        this.vehicle_year = year;
    }

    public String[] getBody_style() {
        return this.body_style;
    }

    public void setBody_style(String[] body_style) {
        this.body_style = body_style;
    }

    public Vehicle() {
    }

    public Vehicle(Long id, String make, String model, String year) {
        this.id = id;
        this.vehicle_make = make;
        this.vehicle_model = model;
        this.vehicle_year = year;
    }
}
