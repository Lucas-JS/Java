package generics.application;

import java.util.ArrayList;
import java.util.List;

import generics.entities.Circle;
import generics.entities.Rectangle;
import generics.entities.Shape;

public class DelimitedWildcardShapesApp {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: "+totalArea(myCircles));
	}
	
	// aceita qualquer lista que seja um subtipo de Shape
	public static double totalArea(List<? extends Shape> list) {
		// não é possível adicionar elementos na lista dentro do método, pois o compilador não sabe qual o tipo de lista está parametrizada
		// exemplo -> list.add(new Rectangle(2.0,3.0)); é um subtipo de Shape, mas não é possível saber se é compativel com o subtipo do parametro, no caso Circle
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
}
