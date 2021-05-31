package exercicios1a6;

import java.util.Scanner;

public class exercicio3 {

	    public static void main(String[] args) {
		    	   	
//programa que calcula total de pessoas com menos de 21 anos e mais de 50.
	    	
		Scanner ler = new Scanner(System.in);
		
		   int idade,contador21=0,contador50=0;
		   
           System.out.print("\n Digite a idade: ");
           
           idade = ler.nextInt();
           
           while(idade!=-99)
              {
                  if(idade<21) contador21++;
                  if(idade>50) contador50++;
                  
           System.out.print("\n Digite a idade da pessoa (para Sair digite -99) : ");
           
             idade = ler.nextInt();
              }
    System.out.printf("\n O Total de pessoas com menos de 21 anos E:%d",contador21);
    System.out.printf("\n O Total de pessoas com mais de 50 anos E:%d",contador50);

	}

}
