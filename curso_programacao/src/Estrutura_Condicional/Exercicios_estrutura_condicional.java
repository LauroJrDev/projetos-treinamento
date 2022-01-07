package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_estrutura_condicional {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*EXERCICIO 07
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if ( X != 0.0 || Y != 0.0) {
			if (X == 0.0 && Y != 0.0) {
				System.out.println("Eixo X");
			}
			else if (X != 0.0 && Y == 0.0) {
				System.out.println("Eixo Y");
			}
			else if (X > 0.0 && Y > 0.0) {
				System.out.println("Q1");	
			}
			else if (X > 0.0 && Y < 0.0) {
				System.out.println("Q4");	
			}
			else if (X < 0.0 && Y > 0.0) {
				System.out.println("Q2");	
			}
			else if (X < 0.0 && Y < 0.0) {
				System.out.println("Q3");	
			}
		}
		else {
			System.out.println("Origem");
		}*/
		
		//EXERCICIO 08
		double salario = sc.nextDouble();
		double faixa8, faixa18, faixa28;
		
		if (salario < 2000.00) {
			System.out.println("ISENTO");
			
		}
		else if (salario <= 3000.00) {
			faixa8 = (salario - 2000.00) * 0.08;
			System.out.printf("Imposto Devido: R$ %.2f%n", faixa8);
		}
		else if (salario <= 4500.00) {
			faixa8 = 1000.00 * 0.08;
			faixa18 = ((salario - 3000.00) * 0.18)+ faixa8;
			System.out.printf("Imposto Devido: R$ %.2f%n", faixa18);
		}
		else if (salario > 4500.00) {
			faixa8 = 1000.00 * 0.08;
			faixa18 = 1500.00 * 0.18;
			faixa28 = ((salario - 4500.00) * 0.28) + faixa8 + faixa18;
			System.out.printf("Imposto Devido: R$ %.2f%n", faixa28);
		}
		
		sc.close();

	}

}
