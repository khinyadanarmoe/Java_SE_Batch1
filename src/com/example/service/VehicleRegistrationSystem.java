package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment5_VehicleManagementSystem.Car;
import Assignment5_VehicleManagementSystem.Motorcycle;
import Assignment5_VehicleManagementSystem.Truck;
import Assignment5_VehicleManagementSystem.Vehicle;

public class VehicleRegistrationSystem {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Vehicle[] vehicleDB = new Vehicle[1000];

	public Vehicle getVehicleInfo() throws IOException {

		String flag;
		do {

			System.out.print("What is the vehicle type: car/ truck/ motorcycle? ");
			String type = br.readLine();

			System.out.print("Brand: ");
			String brand = br.readLine();

			System.out.print("model: ");
			String model = br.readLine();

			if (type.equalsIgnoreCase("car")) {
				vehicleDB[Vehicle.getCount()] = this.getCarInfo(brand, model);
			} else if (type.equalsIgnoreCase("truck")) {
				vehicleDB[Vehicle.getCount()] = this.getTruckInfo(brand, model);
			} else if (type.equalsIgnoreCase("motorcycle")) {
				vehicleDB[Vehicle.getCount()] = this.getMotorcycleInfo(brand, model);
			}

			System.out.print("Do you want to add another vehicle: ");
			flag = br.readLine();

		} while (flag.equalsIgnoreCase("yes"));
		return null;

	}

	public Car getCarInfo(String brand, String model) throws IOException {

		System.out.print("Enter number of doors: ");
		int doors = Integer.parseInt(br.readLine());

		Car car = new Car(brand, model, doors);
		return car;

	}

	public Truck getTruckInfo(String brand, String model) throws IOException {

		System.out.print("Enter payload capacity: ");
		Double payloadCap = Double.parseDouble(br.readLine());

		Truck truck = new Truck(brand, model, payloadCap);
		return truck;
	}

	public Motorcycle getMotorcycleInfo(String brand, String model) throws IOException {

		System.out.print("Does it have side car: ");
		boolean hasSidecar =Boolean.parseBoolean(br.readLine());

		Motorcycle motorcycle = new Motorcycle(brand, model, hasSidecar);
		return motorcycle;
	}

}
