package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Enter the name of student: ");
		std.name = sc.nextLine();
		System.out.println("Enter 1st grade: ");
		std.grade1 = sc.nextDouble();
		System.out.println("Enter 2nd grade: ");
		std.grade2 = sc.nextDouble();
		System.out.println("Enter 3rd grade: ");
		std.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", std.finalGrade());
		
		if(std.finalGrade() < 60) {
			System.out.println("FAIL");
			System.out.printf("Missing %.2f points %n",std.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
