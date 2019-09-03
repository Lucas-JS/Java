package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterApp {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is teh dollar price? ");
		double doll = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		int many = sc.nextInt();
		
		double c = CurrencyConverter.convReais(doll,many);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", c);
		
		sc.close();

	}

}
