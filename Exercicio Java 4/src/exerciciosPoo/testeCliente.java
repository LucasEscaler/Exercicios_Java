package exerciciosPoo;

public class testeCliente {

	public static void main(String[] args) {
	
		cliente client = new cliente();
		client.setNome("Michael Ueda");
		client.setIdade(23);
		client.setEndere�o("Estado de Curitiba");
		client.setCPF(193.000);
		
		System.out.println(client.getNome());
		System.out.println(client.getIdade());
		System.out.println(client.getEndere�o());
		System.out.println(client.getCPF());
		

	}

}
