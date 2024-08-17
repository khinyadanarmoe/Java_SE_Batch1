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
	public String toString() {
		String objStr = super.toString();
		objStr += "Total Salary: " + calculateSalary() + "\n";
		return objStr;
	}

}
