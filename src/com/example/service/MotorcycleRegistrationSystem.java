package com.example.service;

import java.io.IOException;

import Assignment5_VehicleManagementSystem.Motorcycle;

public class MotorcycleRegistrationSystem extends VehicleRegistrationSystem {

	public MotorcycleRegistrationSystem(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Motorcycle vehicleInfo() throws IOException {

		System.out.print("Does it have side car: ");
		boolean hasSidecar =Boolean.parseBoolean(br.readLine());

		Motorcycle motorcycle = new Motorcycle(getVehicle().getBrand(), getVehicle().getModel(), hasSidecar);
		return motorcycle;
	}
}
