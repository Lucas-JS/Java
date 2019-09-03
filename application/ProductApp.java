package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product();
		
		product.setName(name);
		product.setPrice(price);
		
		System.out.println();
		System.out.println("Product data: "+product);
		
		System.out.println("");
		System.out.println("Enter the number of pruducts to be added in stock: ");
	    int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: "+product);
		
		System.out.println("Enter the number of pruducts to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: "+product);
		
		sc.close();
	}
}
