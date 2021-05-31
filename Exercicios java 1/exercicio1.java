package Exercicios;

import java.util.Scanner;

public class exerciciosLucas {

	public static void main(String[] args) {
		
		  Scanner ler = new Scanner(System.in);
			int IdadeAnos , IdadeMeses, IdadeDias, IdadeTotalDias;
			
			System.out.print("Calculadora de idade em dias\n\n"); 


			System.out.print("Digite os anos vividos: ");
			IdadeAnos = ler.nextInt();
			
			System.out.print("Digite os meses: ");
			IdadeMeses = ler.nextInt();

			System.out.print("Digite os dias: ");
			IdadeDias = ler.nextInt();


			IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
			System.out.print("A Idade total em dias é = "+IdadeTotalDias+"\n");

	}

}
