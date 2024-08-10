package JavaLs4;

public class main_app {
	
	public static void main(String[] args) {
		
		bankAcc acc = new bankAcc("121212", 8000);
		
		acc.display();
		acc.withdraw(800);
		acc.display();
	}

}
