package course;

import java.util.Locale;
import java.util.Scanner;

public class ListaExe1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		// Exercicio 1 - Somar dois valores inteirose mostrar msg com resultado
		/*
		int soma, a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("Valor da soma é: "+soma);
		
		// Exercicio 2 - Ler o valor do raio de um circulo e depois exibir a area do circulo com 4 casas decimais
		
		double raio, area;
		
		System.out.println("Digite o tamanho do raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI*(Math.pow(raio, 2));
		
		System.out.printf("Area do circulo: %.4f%n",area);
		
		//Exercicio 3 - Ler 4 valores inteiros A, B, C, D e calcular a diferenca do produto de A e B pelo produto de C e D
		
		int A,B,C,D, prodAB, prodCD, diferenca;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		C = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		D = sc.nextInt();
		
		prodAB = A * B;
		prodCD = C * D;
		diferenca = prodAB - prodCD;
		
		System.out.println("Diferenca: "+diferenca); 
		
		/* Exercicio 4 -
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		 *  o valor que recebe por hora e calcula o salário desse funcionário.
		 *   A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 */
		
		/*
		
		int numFunc, horasTrab;
		double valorHora, salario;
		
		System.out.println("Digite o numero do funcionario: ");
		numFunc = sc.nextInt();
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		horasTrab = sc.nextInt();
		
		System.out.println("Digite o valor ganho por hora: ");
		valorHora = sc.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.printf("Funcionario numero %d, salario = $%.2f", numFunc, salario); */
		
		/* Exe 5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
		 *  o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
		 *  Calcule e mostre o valor a ser pago.
		 */
		/*
		
		int codPeca1, codPeca2, undPeca1, undPeca2;
		double valorPeca1, valorPeca2;
		
		System.out.println("Digite o codigo, quantidade e valor da peca 1: ");
		codPeca1 = sc.nextInt();
		undPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o codigo, quantidade e valor da peca 2: ");
		codPeca2 = sc.nextInt();
		undPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
	
		double total = (undPeca1*valorPeca1)+(undPeca2*valorPeca2);
		
		System.out.printf("Valor a pagar: $%.2f",total); */
		
		/* Exe 6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		 *  Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		double a, b, c;
		
		System.out.println("Digite A, B e C (mesma linha): ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double trianguloRet = (a * c) / 2;
		double areaCirc = Math.PI*(Math.pow(c, 2));
		double areaTrapezio = ((a + b) * c)/2;
		double areaQuad = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n", trianguloRet);
		System.out.printf("Circulo: %.3f%n", areaCirc);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuad);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}












