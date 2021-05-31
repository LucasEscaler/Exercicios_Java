package Exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idadeAnos , idadeMeses, totaldeDias, totalDias, idadeDias;
		
		System.out.print("Digite a quantidade de Dias: ");
		totalDias = ler.nextInt();
		
		idadeAnos = totalDias/365;
		idadeMeses = totalDias/30;
		totalDias = totalDias%30;
		idadeDias = totalDias;
		
		System.out.print("A idade é: " + idadeAnos + " anos");
		System.out.print("\nA quantidade de meses é:" + idadeMeses + " meses");
		System.out.print("\nA quantidade de dias é: " + idadeDias + " dias");
		
		
		
				
		

	}

}
