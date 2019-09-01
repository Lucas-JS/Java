package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase;

		System.out.println("Digite a frase: ");
		frase = sc.nextLine();
		
		sc.close();

		System.out.println("frase digitada: " + frase);
	}

}
