import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*EXEMPLO
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco );
		
		 EXERCÍCIO 01
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		EXERCÍCIO 02
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("Saída: A = %.4f%n", area);
		
		EXERCÍCIO 03
		int A,B,C,D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		EXERCICIO 04
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = horas * valor;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		EXERCÍCIO 05
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double pagar = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);*/
		
		//EXERCICIO 06
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double triangulo = (A * C) / 2;
		double circulo = pi * Math.pow(C, 2);
		double trapezio = ((A + B) * C) / 2;
		double quadrado = B * B;
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}
