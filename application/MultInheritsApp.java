package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class MultInheritsApp {
	
	public static void main(String[] args) {
		
		ConcreteScanner s = new ConcreteScanner("8080");
		s.processDoc("My email");
		System.out.println("Scan result: "+s.scan());
		
		System.out.println();
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		ComboDevice c = new ComboDevice("5050");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Combo result: "+c.scan());
		
	}
}
