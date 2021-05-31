package exercicio2;

public class testeAviao {

	public static void main (String args[]) {
		aviao aviao = new aviao();
		
		aviao.setModelo("O modelo é: Airbuss 164");
		aviao.setDestino("O destino é: Buenos Aires");
		aviao.setLugares(42);
		aviao.setPreço(2700);
		
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getDestino());
		System.out.println(aviao.getLugares() + " lugares");
		System.out.println(aviao.getPreço() + " Reais");
		
	}
}
