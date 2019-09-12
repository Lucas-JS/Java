package entities;

public class Account {
	
	//private double tax = 5.0;
	private String holder;
	private Integer number;
	protected Double balance;
	
	public Account() {
		
	}
	
	public Account (Integer number, String holder, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	
	public Account (String holder, Integer number, Double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.0;
	}
	
	public String toString() {
		return "Account "+getNumber()
			+", Holder: "+getHolder()
			+", Balance: $ "
			+String.format("%.2f", getBalance());
	}

}
