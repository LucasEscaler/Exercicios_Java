package exercicio2;

public class testeAviao {

	public static void main (String args[]) {
		aviao aviao = new aviao();
		
		aviao.setModelo("O modelo �: Airbuss 164");
		aviao.setDestino("O destino �: Buenos Aires");
		aviao.setLugares(42);
		aviao.setPre�o(2700);
		
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getDestino());
		System.out.println(aviao.getLugares() + " lugares");
		System.out.println(aviao.getPre�o() + " Reais");
		
	}
}
