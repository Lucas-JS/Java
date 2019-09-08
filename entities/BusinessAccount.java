package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(String accountHolder, int accountNumber, double initialDeposit, Double loanLimit) {
		super(accountHolder, accountNumber, initialDeposit);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			accountBalance += amount - 10.0;
		}
	}
}
