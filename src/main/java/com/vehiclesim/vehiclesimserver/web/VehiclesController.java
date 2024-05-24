package com.vehiclesim.vehiclesimserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclesim.vehiclesimserver.model.Vehicle;
import com.vehiclesim.vehiclesimserver.service.VehiclesService;

@RestController
public class VehiclesController {

    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    };

    @GetMapping("/vehicles")
    public Iterable<Vehicle> get() {
        return vehiclesService.getAll();
    };

    @GetMapping("/vehicles/findByYear/{year}")
    public Iterable<Vehicle> findByYear(String year) {
        return vehiclesService.findByYear(year);
    };

}