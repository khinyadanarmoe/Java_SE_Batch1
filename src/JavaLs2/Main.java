package JavaLs1;

public class Main {

	public static void main(String args[]) {
		
		Employee emp1 = new Employee();
		emp1.name = "mgmg";
		emp1.age = 29;
		emp1.address = "dawei";
		
		Employee emp2 = new Employee();
		emp2.name = "agag";
		emp2.age = 26;
		emp2.address = "thai";
		
		Employee emp3 = new Employee();
		emp3.name = "ygyg";
		emp3.age = 20;
		emp3.address = "yangon";
		
		emp1.display();
		emp2.display();
		emp3.display();
	}
}
