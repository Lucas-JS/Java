// Adding some stuff
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountApp {
	
	public static void main(final String[] args) {

		Locale.setDefault(Locale.US);
		final Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		final int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		final String accountHolder = sc.nextLine();

		System.out.print("Is there a initial deposit? (y/n)");
		final char resp = sc.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			final double value = sc.nextDouble();
			account = new Account(number, accountHolder,value);
		}else {
			account = new Account(number, accountHolder, 0.0);
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
