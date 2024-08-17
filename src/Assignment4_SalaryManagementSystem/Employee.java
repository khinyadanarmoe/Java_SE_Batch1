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
	
	public double calculateSalary() {
		return 0.0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public static int getCount() {
		return count;
	}
	
	public String toString() {
		String objStr = "Employee name: " + getName() + "\n";
		objStr += "Employee Id: " + getEmployeeId() + "\n";
		objStr += "Employee basic salary: " + getBasicSalary() + "\n";
		
		return objStr;
	}
}
