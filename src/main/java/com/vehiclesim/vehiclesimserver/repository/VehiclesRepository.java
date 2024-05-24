package com.vehiclesim.vehiclesimserver.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vehiclesim.vehiclesimserver.model.Vehicle;

@Repository
public interface VehiclesRepository extends CrudRepository<Vehicle, String> {
    List<Vehicle> findByVehicleYear(String year);
}