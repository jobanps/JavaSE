package week08OOPPrac;

public class BankAccount {

	// class properties
	// ------------------------------
	private double balance;
	private String name;
	
	// class constructor
	// ------------------------------
	public BankAccount() {
		this.balance = 0;
		this.name = "";
	}

	// class functions
	// ------------------------------
	public void deposit(double money) {
		this.balance = this.balance + money;
		System.out.println("$" + money + " has been deposited to your account.");
	}
	
	public void withdraw(double money) {
		this.balance = this.balance - money;
		System.out.println("You have withdrawn $" + money + " from your account.");
	}
	
	// Getters and Setters
	// ------------------------------
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
