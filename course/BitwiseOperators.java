package course;

import java.util.Scanner;

public class BitwiseOperators {
	
	/* Operadores bitwise realizam operacoes logicas bit a bit
	 * 
	 * 		OPERADOR		SIGNIFICADO
	 * 			&			operacao "E" bit a bit 	
	 * 			|			operacao "OU" bit a bit
	 * 			^			operacao "OU-exclusivo"(XOR) bit a bit
	 */
	
	public static void main(String[] args) {
		/*
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000; // 32 binario
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}		
		
		sc.close();	
	}
}
