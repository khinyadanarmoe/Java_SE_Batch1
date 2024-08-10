package JavaLs4;

public class bankAcc {

	private String id;
	
	private double balance;
	
	
	public bankAcc(String id, double openingBalance) {
		this.id = id;
		this.balance = openingBalance;
	}
	
	public void display() {
		
		System.out.println("Balance: " + this.balance);
		System.out.println("id: " + this.id);
	}
	
	public void withdraw(double Amt) {
		
		if (this.balance > Amt) {
			this.balance -= Amt;
			System.out.println("Withdraw successful");
		}
		else {
			System.out.println("Withdraw unsuccessful");
		}
	}
	
	public void deposit(double Amt) {
		
		if (Amt > 0) {
			this.balance += Amt;
		}
	}
	

	
}
