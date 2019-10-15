package generics.application;

public class HashCodeEqualsEx {

	/* HashCode e equals 
	 * São operadores da classe Object utilizados para comparar se um objeto é igual a outro
	 * equals = lento, resposta 100% garantida
	 * HashCode = rápido, porém resposta positiva não é 100%
	 * 
	 * Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementacão para estas operacões
	 * Classes personalizadas precisam sobrepô-las.
	 * */
	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		
		// Equals compara se um objeto é igual a outro, retornando true ou false
		System.out.println(a.equals(b));
		
		/*HashCode retorna um número inteiro representando um código gerado a partir
			das informacões de um objeto.
		*/	
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	// Se o codigo de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)

	}
}
