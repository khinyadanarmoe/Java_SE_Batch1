package Assignment5_VehicleManagementSystem;

import java.io.IOException;

import com.example.service.VehicleRegistrationSystem;

public class Test {

	public static void main(String[] args) throws IOException {
		
		VehicleRegistrationSystem service = new VehicleRegistrationSystem();
		service.getVehicleInfo();
		
		for (int i = 0; i < Vehicle.getCount(); i++) {
			VehicleRegistrationSystem.vehicleDB[i].displayInfo();
		}

	}


}
