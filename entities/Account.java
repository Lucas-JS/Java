package entities;

public class Account {
	
	private double tax = 5.0;
	private String accountHolder;
	private int accountNumber;
	private double accountBalance;
	
	public Account() {
		
	}
	
	public Account (String accountHolder, int accountNumber, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}
	
	public Account (String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double value) {
		this.accountBalance += value;
	}
	
	public void withdraw(double value) {
		this.accountBalance -= value + tax;
	}
	
	public String toString() {
		return "Account "+getAccountNumber()
			+", Holder: "+getAccountHolder()
			+", Balance: $ "
			+String.format("%.2f", getAccountBalance());
	}

}
