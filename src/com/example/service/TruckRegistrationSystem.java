package com.example.service;

import java.io.IOException;

import Assignment5_VehicleManagementSystem.Truck;

public class TruckRegistrationSystem extends VehicleRegistrationSystem {

	public TruckRegistrationSystem(String type) {
		super(type);

	}

	@Override
	public Truck vehicleInfo() throws IOException {

		System.out.print("Enter payload capacity: ");
		Double payloadCap = Double.parseDouble(br.readLine());

		Truck truck = new Truck(getVehicle().getBrand(), getVehicle().getModel(), payloadCap);
		return truck;
	}

}
