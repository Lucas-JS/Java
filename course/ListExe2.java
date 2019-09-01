package course;

import java.util.Locale;
import java.util.Scanner;

public class ListExe2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		// Exe 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		int n1;
		
		System.out.println("Digite um inteiro: ");
		n1 = sc.nextInt();
		
		if(n1 < 0) {
			System.out.println("Negativo!");
		}else if(n1 > 0){
			System.out.println("Não negativo!");
		}else {
			System.out.println("Não negativo!.. tão pouco positivo..");
		}
		
		// Exe 2 -Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		int n2;
		
		System.out.println("Digite um inteiro: ");
		n2 = sc.nextInt();
		
		if(n2 % 2 == 0) {
			System.out.println("Par!");
		}else {
			System.out.println("Ímpar!");
		}
		*/
		
		/* Exe 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
		 *  ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
		 *  Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		 */
		/*
		int a, b;
		
		System.out.println("Digite 2 valores inteiros (mesma linha): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0) {
			System.out.println("São multiplos!");
		}else if(b % a == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		*/
		
		/* Exe 4- Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		 *  sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 *  tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		/*
		System.out.println("Digite a hora inicia e hora final do jogo (mesma linha):");
		int horaIni = sc.nextInt();
		int horaFin = sc.nextInt();
		
		int duracao;
		
		if (horaIni < horaFin) {
			duracao = horaFin - horaIni;
		}else {
			duracao = 24 - horaIni + horaFin;
		}
		
		System.out.println("O jogo durou: "+ duracao +" horas."); */
		
		/* Exe 5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
		 *  A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * CODIGO		PRODUTO			PRECO
		 * 		1		hot-dog			r$ 4.00	
		 * 		2		x-salada		r$ 4.50
		 * 		3		x-bacon			r$ 5.00
		 * 		4	torrada simples		r$ 2.00
		 * 		5		refrigerante	r$ 1.50
		 */
		
		/*
		int codigo, qtd;
		System.out.println("Digite o codigo e a quantidade do produto: ");
		codigo = sc.nextInt();
		qtd = sc.nextInt();

		if(codigo == 1) {
			System.out.printf("Total: r$ %.2f",(4.00*qtd));
		}else if(codigo == 2) {
			System.out.printf("Total: r$ %.2f%n",(4.50*qtd));
		}else if(codigo == 3) {
			System.out.printf("Total: r$ %.2f%n",(5.00*qtd));
		}else if(codigo == 4) {
			System.out.printf("Total: r$ %.2f%n",(2.00*qtd));
		}else if(codigo == 5) {
			System.out.printf("Total: r$ %.2f%n",(1.50*qtd));
		}else {
			System.out.println("Codigo inválido!");
		} */
		
		/* Exe 6- Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”  		 
		 */
		/*
		System.out.println("Digite um número qualquer: ");
		double num = sc.nextDouble();
		
		if(num >= 0 && num <= 25) {
			System.out.println("Intervalo [0, 25]");
		}else if(num > 25 && num <= 50) {
			System.out.println("Intervalo [25, 50]");
		}else if(num > 50 && num <= 75) {
			System.out.println("Intervalo [50, 75]");
		}else if(num > 75 && num <= 100) {
			System.out.println("Intervalo [75, 100]");
		}else {
			System.out.println("Fora do intervalo!");
		} */
		
		/* Exe 7 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
		 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto,
		 *  ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 *  Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 *  Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. 
		 */
		/*
		System.out.println("Digite 2 numeros com uma casa decimal: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem!");
		}else if (x == 0.0) {
			System.out.println("Eixo Y!");
		}else if (y == 0.0) {
			System.out.println("Eixo X!");
		}else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		} */
		
		/* Exercicio 8 - calculo de imposto de renda
		 * 		RENDA				IMPOSTO
		 * 	de 0 a 2000.00			isento
		 * 	de 2000.01 a 3000.00		8%
		 * 	de 3000.01 a 4500.00	   18%
		 *  acima de 4500.00		   28%
		 *  
		 *  OBS: As taxas incidem somente sobre o valor excedente  			
		 */
		
		System.out.println("Digite o salário com 2 casas decimais: ");
		double salario = sc.nextDouble();
		double imposto;
		
		
		if (salario <= 2000.00) {
			
			System.out.println("Isento!");
			
		}else if (salario > 2000.00 && salario <= 3000.00) {
			
			imposto = (salario - 2000.00) * .08;
			System.out.printf("Imposto: R$%.2f%n",imposto);
			
		}else if (salario > 3000.00 && salario <= 4500.00) {
			
			imposto = (salario - 3000.00)*.18 + 1000.00 * .08;
			System.out.printf("Imposto: R$%.2f%n",imposto);
			
		}else if (salario > 4500.00) {
			
			imposto = (salario - 4500.00)*.28 + 1500.00 *.18 + 1000.00 *.08;
			System.out.printf("Imposto: R$%.2f%n",imposto);
			
		}
		
		sc.close();
	}
}



