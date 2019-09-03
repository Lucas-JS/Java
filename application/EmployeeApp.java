package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter the name of employee: ");
		emp.name = sc.nextLine();
		
		System.out.println("Enter the gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Enter the tax value: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.println("Which percentage to increase salary? ");
		double tax = sc.nextDouble();
		emp.increaseSalary(tax);
		
		System.out.println("Updated data: "+emp);
		
		sc.close();
		
	}

}
