package exercicios1a6;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		   Scanner ler = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "� n�mero: ");
	            num = ler.nextInt();
	            
	            if(num % 2 == 0){
	                contPar++;
	            }
	                
	            if (num % 2 == 1)
	            	contImpar++;          
	    	       
	                
	        System.out.println("Foram digitados " + contPar + " n�meros pares");
	                    
	        System.out.println("E " + contImpar + " n�meros �mpares");
	                
	           
	     

	}

}
	
}


