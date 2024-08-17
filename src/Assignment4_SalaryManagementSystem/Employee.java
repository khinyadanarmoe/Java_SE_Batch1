package Assignment4_SalaryManagementSystem;

public class Employee {

	private String name;
	private int employeeId;
	private double basicSalary;
	private static int count = 0;
	
	public Employee(String name, int employeeId, double basicSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public double getEmployeeId() {
		return employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public static int getCount() {
		return count;
	}
	
	public double calculateSalary() {
		return 0.0;
	}
	
	public void displayDetails() {
		
		System.out.println("Employee: " + getName());
		System.out.println("Employee Id: " + getEmployeeId());
		System.out.println("Basic Salary: " + getBasicSalary());
	}
}
