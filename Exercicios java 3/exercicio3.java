package exerciciosDeVetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
        Random sorteio = new Random();
		
		int A [][] = new int[3][3];
		int maior10 = 0;
		
		for(int L = 0; L < A.length; L++) {
			for(int C = 0; C < A.length; C++) {
				
				System.out.print("Insira um valor: ");
				A[L][C] = ler.nextInt();
				
				if(A[L][C] > 10) {
					maior10++;
				}

			}
		}
		
		System.out.printf("\nA quantidade de numero maiores que 10 dentro da matrix é: %d",maior10);


	}

}
