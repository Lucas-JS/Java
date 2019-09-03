package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountApp {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
	
		System.out.print("Is there a initial deposit? (y/n)");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			account = new Account(accountHolder, number, value);
		}else {
			account = new Account(accountHolder, number);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
