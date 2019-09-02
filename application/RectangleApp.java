package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
		
		System.out.println("Enter measures for rectangle x: ");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.println("AREA: "+x.area());
		System.out.println("PERIMETER: "+x.perimeter());
		System.out.println("DIAGONAL: "+x.diagonal());
		
		sc.close();
	}
}
