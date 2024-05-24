package com.vehiclesim.vehiclesimserver.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonValue;

@Table(name = "VEHICLES")
public class Vehicle {

    @Column("VEHICLE_YEAR")
    private String vehicleYear;
    @Column("VEHICLE_MAKE")
    private String vehicleMake;
    @Column("VEHICLE_MODEL")
    private String vehicleModel;

    @Column("BODY_STYLES")
    @JsonValue
    private String bodyStyles;

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String make) {
        this.vehicleMake = make;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String model) {
        this.vehicleModel = model;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String year) {
        this.vehicleYear = year;
    }

    public String getBodyStyles() {
        return this.bodyStyles;
    }

    public void setBodyStyles(String bodyStyle) {
        this.bodyStyles = bodyStyle;
    }

    public Vehicle() {
    }

    public Vehicle(String make, String model, String year, String bodyStyles) {

        this.vehicleMake = make;
        this.vehicleModel = model;
        this.vehicleYear = year;
        this.bodyStyles = bodyStyles;
    }
}
