package com.vehiclesim.vehiclesimserver.web;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.vehiclesim.vehiclesimserver.model.Vehicle;

@RestController
public class VehicleController {
    // Vehicle vehicle1 = new Vehicle("Toyota", "Camry", "2012");
    // Vehicle vehicle2 = new Vehicle("Honda", "Accord", "2015");
    
    private List<Vehicle> db = List.of(
        new Vehicle("1", "Toyota", "Camry", "2012"), 
        new Vehicle("2", "Honda", "Accord", "2015")
        );


    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    };

    @GetMapping("/vehicles")
    public Collection<Vehicle> get() {
        return db;
    };
}