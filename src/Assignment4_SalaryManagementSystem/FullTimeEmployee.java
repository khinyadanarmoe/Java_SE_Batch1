package Assignment4_SalaryManagementSystem;

public class FullTimeEmployee extends Employee{

	private double allowance;
	private double bonus;
	
	public FullTimeEmployee(String name, int employeeId, double basicSalary, double allowance, double bonus) {
		super(name, employeeId, basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;	
	}

	@Override
	public double calculateSalary() {
		double salary = this.getBasicSalary() + allowance + bonus;
		return salary;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Total Salary: "+ calculateSalary() + "\n");
	}
}
