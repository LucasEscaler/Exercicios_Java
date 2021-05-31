package exercicios1a6;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
//Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.
		
		
		Scanner ler = new Scanner(System.in);
		
		 int numero, soma=0;
		 float media=0, cont=0;
		 
		 System.out.print("\n Digite um numero inteiro: ");
		 numero = ler.nextInt();
		 
		 if(numero %3==0 && numero!=0)
		 {
		 soma=soma+numero;
		 cont++;
		 }
		 while(numero!=0)
		{
		 System.out.print("\n Digite um numero inteiro: ");
		 numero= ler.nextInt();

		 if(numero %3==0 && numero!=0)
		 {
		 soma=soma+numero;
		 cont++;
		 }}
		 media=soma/cont;
		 System.out.printf("\n\n A media dos numeros é: %3.2f ",media);

	}

}
