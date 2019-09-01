package course;

public class TernaryCond {
	
	// Estrutura opcional ao -if-else quando se deseja decidir um VALOR com base em uma condicão
	// Sintaxe: (condicao) ? valor_se_verdadeiro : valor_se_falso
	
	public static void main(String[] args) {
		
		double preco = 34.5;
		
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}
}
