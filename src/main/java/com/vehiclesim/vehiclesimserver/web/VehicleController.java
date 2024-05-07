package com.vehiclesim.vehiclesimserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    };
}