package com.example.service;

import java.io.IOException;

import Assignment4_SalaryManagementSystem.FullTimeEmployee;

public class FulltimeEmpRegistrationService extends EmployeeRegistrationService {

	@Override
	public FullTimeEmployee employeeInfo() throws IOException {
		System.out.print("Enter Allownance: ");
		Double allowance = Double.parseDouble(br.readLine());

		System.out.print("Enter Bonus: ");
		Double bonus = Double.parseDouble(br.readLine());

		FullTimeEmployee fulltimeEmp = new FullTimeEmployee(getEmployee().getName(), getEmployee().getBasicSalary(), allowance, bonus);

		return fulltimeEmp;

	}
	
}

