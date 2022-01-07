package Estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio_Parte3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*EXERCICIO 01
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");*/
		
		/* EXERCICIO 02
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Q2");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}*/

		// EXERCICIO 03
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo_combustivel = 0;
		
		System.out.println("Digite o código do combustivel: ");
		tipo_combustivel = sc.nextInt();
		
		while (tipo_combustivel != 4) {
			if (tipo_combustivel == 1) {
				alcool += 1;
			}
			else if (tipo_combustivel == 2) {
				gasolina += 1;
			}
			else if (tipo_combustivel == 3) {
				diesel += 1;
			}
			else {
			    System.out.println("Digite um código válido: ");	
			}
			tipo_combustivel = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
