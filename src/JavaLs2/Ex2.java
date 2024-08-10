package JavaLs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String arg[]) throws IOException {
		
	
//		System.out.print("Enter password: ");
//		
//		while (!br.readLine().equalsIgnoreCase("admin")) {
//			System.out.println("Incorrect");
//			System.out.print("Enter password: ");
//		}
//		
//		System.out.println("Correct");
		
		String password = ""; // loop variant
		do {
			System.out.print("Enter password: "); // loop body
			password = br.readLine(); // loop var change
		}while(!password.equals("admin")); // test condition
		
		System.out.println("Correct");
	}
}
