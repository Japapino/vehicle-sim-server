package com.vehiclesim.vehiclesimserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclesim.vehiclesimserver.model.Vehicle;
import com.vehiclesim.vehiclesimserver.repository.VehiclesRepository;

@Service
public class VehiclesService {

    private final VehiclesRepository vehiclesRepository;

    public VehiclesService(@Autowired VehiclesRepository vehiclesRepository) {
        this.vehiclesRepository = vehiclesRepository;
    }

    public Iterable<Vehicle> getAll() {
        return vehiclesRepository.findAll();
    }

    public Iterable<Vehicle> findByYear(String year) {
        return vehiclesRepository.findByVehicleYear(year);
    };
}
