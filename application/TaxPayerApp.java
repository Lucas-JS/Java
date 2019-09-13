package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.TaxPayer;

public class TaxPayerApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i =1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPayer(name, income, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new CompanyPayer(name, income, employees));
			}
			
		}
		
		System.out.println();
		double totalTax = 0.0;
		System.out.println("TAXES PAID: ");
		for(TaxPayer payer : list) {
			System.out.printf(payer.getName()+" $%.2f%n",payer.tax());
			totalTax += payer.tax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f",totalTax);
		sc.close();
	}
}
