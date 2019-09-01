package course;

import java.util.Scanner;

public class ListaExe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	/* Exe 1 	
		int senhaValida = 2002;
		int senhaEntrada;
		System.out.println("Digite a senha");
		senhaEntrada = sc.nextInt();
		
		while(senhaEntrada != senhaValida) {
			System.out.println("Senha inválida! Tente novamente: ");
			senhaEntrada = sc.nextInt();			
		}
		System.out.println("Acesso permitido!"); */
	
	/* Exe 2
		
		double x,y;
		System.out.println("Digite as coordenadas X e Y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while(x != 0.0 && y != 0.0) {
			if(x > 0.0 && y > 0.0) {
				System.out.println("Primeiro quadrante.");
				System.out.println("Digite as coordenadas X e Y: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}else if (x < 0.0 && y > 0.0) {
				System.out.println("Segundo quadrante.");
				System.out.println("Digite as coordenadas X e Y: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}else if (x < 0.0 && y < 0.0) {
				System.out.println("Terceiro quadrante;");
				System.out.println("Digite as coordenadas X e Y: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}else {
				System.out.println("Quarto quadrante.");
				System.out.println("Digite as coordenadas X e Y: ");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
		}
		
		System.out.println("Fim.");
	*/
		
	/* Exe 3 */
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int n;
		
		System.out.println("digite o tipo de combustivel: (1 - alcool, 2 - gasolina, 3 - diesel, 4 - Sair)");
		n = sc.nextInt();
		while(n != 4 ) {
			switch (n) {
			case 1: 
				alcool ++;
				break;
			case 2: 
				gasolina ++;
				break;
			case 3: 
				diesel ++;
				break;	
		
			}
			System.out.println("digite o tipo de combustivel: (1 - alcool, 2 - gasolina, 3 - diesel, 4 - Sair)");
			n = sc.nextInt();				
		}
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();
	} 
		
}
