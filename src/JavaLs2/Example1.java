package JavaLs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String arg[]) throws IOException {
		
		
		String[] employees = new String[100];
		
		employees[0] = "mgmg";
		employees[99] = "aungaung";
		
		for(String name: employees) {
			System.out.println("Name: " + name);
		}
		
		

	}

}
