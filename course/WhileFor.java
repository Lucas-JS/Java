package course;

import java.util.Scanner;

public class WhileFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		while(n <= 0) {
			System.out.println("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		int higher = 0;
		for(int i = 1 ; i <= n; i++) {
			int aux;
			System.out.printf("Enter the #%d number %n", i);
			aux = sc.nextInt();
			if(aux > higher) {
				higher = aux;
			}
		}
		System.out.println("Higher is: "+higher);
		
		sc.close();
	}

}
