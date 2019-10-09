package generics.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPutEx {
	
	public static void main(String[] args) {
		// inspired -> https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e
		/* Princípio Get/Put - Covariância -> Get = OK - Put = ERROR
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0); // possível acessar elementos 
		
		list.add(20); // não é possivel inserir elementos, erro de compilacão
		*/
		
		/* Princípio Get/Put - Contravariância -> Get = ERROR - Put = OK 
		
		List<Object> myObjs = new ArrayList<Object>();
		
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		Number x = myNums.get(0); // erro de compilacão, não é possível acessar elementos, pois o elemento pode ser um supertipo da Classe
		
		*/
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14 , 2.68);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	// lista de origem possui covariancia, por isso é possivel acessar os elementos
	// lista de destino possui contravariancia, por isso é possível adicionar elementos
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	//If at first you don't succeed, call it 1.0 version.
}
