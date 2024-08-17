package Assignment4_SalaryManagementSystem;

public class PartTimeEmployee extends Employee {

	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, int employeeId, double basicSalary, int hoursWorked, double hourlyRate) {
		super(name, employeeId, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		double salary = hoursWorked * hourlyRate;
		return salary;
	}
	
	@Override
	public void displayDetails() {
		this.displayDetails();
		System.out.println("Total Salary: "+ calculateSalary())
	}

}
