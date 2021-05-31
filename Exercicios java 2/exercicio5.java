package exercicios1a6;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		//Programa que mostra a soma dos numeros digitados.
		
		Scanner ler = new Scanner(System.in);
		
		int numero ;

		int soma = 0;

		do {System.out.print("Digite um numero: ");

		numero = ler.nextInt();

		soma += numero;

		}while(numero != 0);

		System.out.printf("Soma = %d", soma);

	}

}
