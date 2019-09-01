package course;

import java.util.Scanner;

public class InputBasics {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence, a, b, c, x, y, z;
		
		System.out.println("Type a sentence: ");
		sentence = sc.nextLine();
		
		System.out.println("Type a: ");
		a = sc.next();
		System.out.println("Type b: ");
		b = sc.next();
		System.out.println("Type c: ");
		c = sc.next();
		
		System.out.println("Type a 3 words phrase: ");
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		
		System.out.println(sentence);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
	}

}
