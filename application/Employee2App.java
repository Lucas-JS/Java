package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Employee2App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		Employee2 employee;
		
		List<Employee2> employeeList = new ArrayList<>();
		
		for(int i =1; i<=n;i++) {
			System.out.println();
			System.out.printf("Employee #%d%n",i);
			System.out.print("Id: ");
			sc.nextLine();
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employee = new Employee2(id, name, salary);
			employeeList.add(employee);
			
		}
		System.out.println();
		System.out.println("Enter the employee id that will be increased: ");
		int id = sc.nextInt();
		
		employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(employee == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			int percentage = sc.nextInt();
			employee.increaseSalary(percentage);		
		}
		
		System.out.println();
		for(Employee2 x : employeeList) {
			System.out.println("List  of employees: ");
			System.out.println(x);
		}
		
		sc.close();
		
	}
}
