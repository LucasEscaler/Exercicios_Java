package exercicios1a6;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		
		
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
		 System.out.printf("\n\n A media dos numeros �: %3.2f ",media);

	}

}
