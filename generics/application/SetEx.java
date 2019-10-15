package generics.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// HashSet - mais rápido (operacões O(1) em tabela hash) e não ordenado
		Set<String> hset = new HashSet<>();

		hset.add("TV");
		hset.add("Tablet");
		hset.add("Notebook");

		System.out.println(hset.contains("Notebook"));

		for (String p : hset) {
			System.out.println(p);
		}
		System.out.println();

		//TreeSet - mais lento (operacoes O(log(n)) em arvore rubro-negra) e ordenado por compareTo (ou Comparator)
		Set<String> tset = new TreeSet<>();

		tset.add("TV");
		tset.add("Tablet");
		tset.add("Notebook");

		for (String p : tset) {
			System.out.println(p);
		}
		System.out.println();
		
		//LinkedHashSet - velocidade intermediária e elementos na ordem que são adicionados.
		Set<String> lset = new LinkedHashSet<>();

		lset.add("TV");
		lset.add("Tablet");
		lset.add("Notebook");

		lset.removeIf(x -> x.charAt(1) == 'a'); 
		for (String p : lset) {
			System.out.println(p);
		}
	}
}
