package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment4_SalaryManagementSystem.ContractEmployee;
import Assignment4_SalaryManagementSystem.Employee;
import Assignment4_SalaryManagementSystem.FullTimeEmployee;
import Assignment4_SalaryManagementSystem.PartTimeEmployee;

public class EmployeeRegistrationService {
	public Employee[] employeeDB = new Employee[1000];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private String name;
	private double basicSalary;
	private String type;

	public Employee getEmployeeInfo() throws IOException {

		String flag;

		do {
			this.commonEmployeeInfo();
			
			if ("contract".equalsIgnoreCase(this.type)) {
				employeeDB[Employee.getCount()] = this.getContractEmpInfo();

			} else if ("fulltime".equalsIgnoreCase(this.type)) {
				employeeDB[Employee.getCount()] = this.getFullTimeEmpInfo();

			} else if ("parttime".equalsIgnoreCase(this.type)) {
				employeeDB[Employee.getCount()] = this.getPartTimeInfo();
			}

			System.out.print("Do you want to add new Employees (yes/no)");
			flag = br.readLine();
		} while (flag.equalsIgnoreCase("yes"));
		return null;

	}

	private void commonEmployeeInfo() throws IOException {

		System.out.print("Enter Emp Name: ");
		this.name = br.readLine();
		System.out.print("Enter Emp Basic Salary: ");
		this.basicSalary = Double.parseDouble(br.readLine());
		System.out.print("Enter Emp Type: (contract/ fulltime/ parttime)? ");
		this.type = br.readLine();
	}

	public ContractEmployee getContractEmpInfo() throws IOException {
		System.out.print("Enter Contract Duration: ");
		int duration = Integer.parseInt(br.readLine());

		System.out.print("Enter Contract Amount: ");
		Double amount = Double.parseDouble(br.readLine());

		ContractEmployee contractEmp = new ContractEmployee(this.name, this.basicSalary, duration, amount);

		return contractEmp;
	}

	public FullTimeEmployee getFullTimeEmpInfo() throws IOException {
		System.out.print("Enter Allownance: ");
		Double allowance = Double.parseDouble(br.readLine());

		System.out.print("Enter Bonus: ");
		Double bonus = Double.parseDouble(br.readLine());

		FullTimeEmployee fulltimeEmp = new FullTimeEmployee(name, basicSalary, allowance, bonus);

		return fulltimeEmp;

	}

	public PartTimeEmployee getPartTimeInfo() throws IOException {
		System.out.print("Enter Hours Worked: ");
		int hoursWorked = Integer.parseInt(br.readLine());

		System.out.print("Enter Hourly Rate: ");
		Double hourlyRate = Double.parseDouble(br.readLine());

		PartTimeEmployee parttimeEmp = new PartTimeEmployee(name, basicSalary, hoursWorked, hourlyRate);

		return parttimeEmp;
	}

}
