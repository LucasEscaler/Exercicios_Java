package Exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
		
	double	CustoDeFabrica, CustoDoConsumidor, Distribuidor;
	
	System.out.print("Entre com o custo de fabrica: ");
	CustoDeFabrica = ler.nextDouble();
	
	Distribuidor = CustoDeFabrica + (CustoDeFabrica * 0.28);
	CustoDoConsumidor = Distribuidor +(Distribuidor * 045);
	
	System.out.print("O custo do consumidor é: "+ CustoDoConsumidor);
	
	

	}

}
