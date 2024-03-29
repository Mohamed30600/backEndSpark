package com.sparkies.spark.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkies.spark.model.Energy;

import com.sparkies.spark.model.User;
import com.sparkies.spark.model.Vehicle;

import com.sparkies.spark.repository.VehicleRepo;
import com.sparkies.spark.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepo vehicleRepo;


	@Override
	public void addVehiculeByUser(Vehicle vehicle, Energy energy, User user) {

		vehicle.setVehicleUser(user);
		vehicle.setEnergy(energy);
		vehicleRepo.save(vehicle);

	}

	@Override
	public Optional<Vehicle> getOneVehicule(Long id) {
		return vehicleRepo.findById(id);
	}

	@Override
	public Iterable<Vehicle> getAllVehicules() {
		return vehicleRepo.findAll();
	}

	@Override
	public void deleteVehicle(Long id) {
		vehicleRepo.deleteById(id);
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicule) {
		return vehicleRepo.save(vehicule);
	}
}
