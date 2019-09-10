package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountApp2 {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING - 	TODO objeto de uma subclasse É UM objeto da superclasse!
		// every BusinessAccount object is an object Account to.
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING - convert an superclass object to an subclass object.
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; this line throw an error because the acc3 isn't a businessAccount
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
