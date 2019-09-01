package course;

public class AtribOperators {

	/*		OPERADOR 		|	EXEMPLO		|	SIGNIFICADO
	 * 			=				a = 10			a RECEBE 10
	 * 			+=				a += 2			a RECEBE a + 2
	 * 			-=				a -= 2			a RECEBE a - 2
	 * 			*=				a *= 2			a RECEBE a * 2
	 * 			/=				a /= 3			a RECEBE a / 2
	 * 			%=				a %= 3			a RECEBE a % 2
	 * */
	
	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("***************************************");
		
		n1 *= 2;
		n2 += n1;
		s += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		/* OPERADORES ARITMETICOS / ATRIBUICAO
		
		Operador 		Exemplo 		Significado
			++			a++ ou ++a		a = a + 1;
			--			a-- ou --a  	a = a - 1;	
		*/
		
		int a = 10;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
