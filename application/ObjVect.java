package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ObjVect {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products you want: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i<vect.length ;i++) {

			System.out.printf("Enter the #%d product name: ",i+1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Enter the #%d product price: ",i+1);
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average price: $%.2f%n",avg);
		
		
		sc.close();
		
	}

}
