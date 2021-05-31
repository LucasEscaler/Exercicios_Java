package exercicios1a6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		/*sexo
		 * 1 - Feminino
		 * 2 - Masculino
		 * 3- outros
		 */
		
		/*Personalidade
		 * 1- Calma
		 * 2- Nervosa
		 * 3- Agressiva
		 */
		
		int idade, sexo, personalidade, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
		outrosCalmos = 0, pessoasNervosasMais40 = 0, pessoasCalmasMenos18 = 0, contePessoas = 0;
		
		while(contePessoas < 150) {
			
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Informe seu sexo: ");
		sexo = ler.nextInt();
		
		System.out.println("Informe sua personalidade: ");
		personalidade = ler.nextInt();
		
		if(personalidade==1) {
			pessoasCalmas++;
			
		if(idade < 18) {
			pessoasCalmasMenos18++;
		}
		}else if(personalidade ==2 && idade> 40) {
		}
		if(sexo == 3 && personalidade == 1) {
			outrosCalmos++;

		}else if(sexo == 1 && personalidade == 2) {
			mulheresNervosas++;
			
		}else if(sexo == 2 && personalidade == 3) {
			homensAgressivos++;
		}
		  contePessoas++;
		

		}
		
		ler.close();
        System.out.println("O numero de pessoas calmas é: " + pessoasCalmas);
        System.out.println("O numero de mulheres nervosas é: " + mulheresNervosas);
        System.out.println("O numero de homens agressivos é: " + homensAgressivos);
        System.out.println("O numero de outros calmos é: " + outrosCalmos);
        System.out.println("O numero de pessoas nervosas com mais de 40 anos é: " + pessoasNervosasMais40);
        System.out.println("O numero de pessoas calmas com menos de 18 anos é: " + pessoasCalmasMenos18);
        
	}
	

}
