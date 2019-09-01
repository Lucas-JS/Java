package course;

import java.util.Scanner;

public class CondExtructures {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Enter a integer number: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		
		System.out.println("What time is it? ");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good morning!");
		}else if(time < 18) {
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good evening!");
		}*/
		
		int n1, n2, n3, higher;
		
		System.out.println("Enter three integers (same line): ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		higher = n1;
		
		if (n2 > higher) {
			higher = n2;
		}
		if(n3 > higher){
			higher = n3;
		}
		
		System.out.println("Higher: "+higher);
		
		
		sc.close();
	}
}










