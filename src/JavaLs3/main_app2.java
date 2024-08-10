package JavaLs3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_app2 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		Employee[] employeeArray = new Employee[100];
		
		String flag;
		do {
			System.out.print("Enter Employee Name: ");
			String name = br.readLine();
			System.out.print("Enter Employee Age: ");
			int age = Integer.parseInt(br.readLine());
			System.out.print("Enter Employee Address: ");
			String address = br.readLine();
			
			Employee emp = new Employee();
			emp.name = name;
			emp.age = age;
			emp.address = address;
			Employee.empCount++;
			
			employeeArray[Employee.empCount] = emp;
			
			System.out.print("Do you want to add new employee: yes / no?: ");
			flag = br.readLine();
			
		} while (flag.equalsIgnoreCase("Yes"));
		
		
		//while using for each loop, there's null in unassigned place, so will have null error 
		for (int i = 0; i < Employee.empCount; i++) {
			employeeArray[i].display();
		}
	}

}
