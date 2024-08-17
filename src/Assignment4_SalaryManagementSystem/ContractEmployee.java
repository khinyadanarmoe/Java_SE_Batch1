package Assignment4_SalaryManagementSystem;

public class ContractEmployee extends Employee {
	
	private int contractDuration;
	private double contractAmount;

	public ContractEmployee(String name, int employeeId, double basicSalary, int contractDuration, double contractAmount) {
		super(name, employeeId, basicSalary);
		this.contractDuration = contractDuration;
		this.contractAmount = contractAmount;
	}

	@Override
	public double calculateSalary() {
		double salary = contractAmount / contractDuration;
		return salary;
	}
	
	@Override
	public void displayDetails() {
		this.displayDetails();
		System.out.println("Total Salary: "+ calculateSalary())
	}
}
