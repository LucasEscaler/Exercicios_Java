package Exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		System.out.print("Programa: Média ponderada. \n\n");
		
		System.out.print("Insira o valor da primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.print("Insira o peso da primeira nota: ");
		peso1 = ler.nextInt();
		
		System.out.print("Insira o valor da segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.print("Insira o peso da segunda nota: ");
		peso2 = ler.nextInt();
		
		System.out.print("Insira o valor da terceira nota: ");
		nota3 = ler.nextInt();
		
		System.out.print("Insira o peso da terceira nota: ");
		peso3 = ler.nextInt();
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1+peso2+peso3);
		System.out.print("A média é: "+ media);
		

	}

}
