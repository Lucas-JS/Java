package generics.application;

import java.util.HashSet;
import java.util.Set;

import generics.entities.Product;

public class ProductCompareHashEquals {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod)); // compara por valor quando existe um HashCode, equals implementado
												// por referencia quando não possui.
	}
}
