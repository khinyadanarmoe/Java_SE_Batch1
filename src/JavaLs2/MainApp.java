package JavaLs1;

public class MainApp {

	public static void main (String args[]) {
		
		int age = 20;
		System.out.println("age: "+ age);
		Employee emp = new Employee();
		emp.name = "MgMg";
		emp.age = 30;
		emp.address = "Yangon";
		System.out.println("Employee: "+ emp.name + " is " + emp.age + "age years old and lives in " + emp.address);
	}
}
