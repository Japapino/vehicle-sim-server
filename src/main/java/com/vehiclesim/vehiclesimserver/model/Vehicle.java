package com.vehiclesim.vehiclesimserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonValue;

@Table(name = "VEHICLES")
public class Vehicle {

    @Id
    private Long id;

    private String vehicle_make;
    private String vehicle_model;
    private String vehicle_year;

    @JsonValue
    private String body_styles;
    
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

    public String getBody_styles() {
        return this.body_styles;
    }

    public void setBody_styles(String body_style) {
        this.body_styles = body_style;
    }

    public Vehicle() {
    }

    public Vehicle(Long id, String make, String model, String year, String body_styles) {
        this.id = id;
        this.vehicle_make = make;
        this.vehicle_model = model;
        this.vehicle_year = year;
        this.body_styles = body_styles;
    }
}
