package JavaLs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumber {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
//		public => access modifier
		
		System.out.print("Enter a number 1: ");
		int firstNum = Integer.parseInt(br.readLine());
		
		
		System.out.print("Enter a number 2: ");
		int secondNum = Integer.parseInt(br.readLine());
		
		int total = firstNum + secondNum;
		
		System.out.print(total);
		
	}
}
