package Exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, f, g, x, y;
		
		System.out.print("Digite o valor de a: ");
		a = ler.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		b = ler.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		c = ler.nextDouble();
		
		System.out.print("Digite o valor de d: ");
		d = ler.nextDouble();
		
		System.out.print("Digite o valor de e: ");
		e = ler.nextDouble();
		
		System.out.print("Digite o valor de f: ");
		f = ler.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.print("O valor de x é: " + x + "e y é: " + y);
		
		

	}

}
