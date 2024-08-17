package Assignment4_SalaryManagementSystem;

public class SalaryTest {

	static Employee[] employees = new Employee[100];
	
	public static void main(String[] args) {
		
		FullTimeEmployee employee1 = new FullTimeEmployee("John Doe", 101, 50000.0, 20000, 500);
		PartTimeEmployee employee2 = new PartTimeEmployee("Jane Smith", 102, 0.0, 10, 1200.0);
		ContractEmployee employee3 = new ContractEmployee("Mark Johnson", 103, 0.0, 5, 25000.0);
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		display();
	}
	
	public static void display() {
		
		for (int i = 0; i < Employee.getCount(); i++) {
			System.out.println(employees[i]);
		}
	}

}
