package exerciciosPoo;

public class testeCliente {

	public static void main(String[] args) {
	
		cliente client = new cliente();
		client.setNome("Michael Ueda");
		client.setIdade(23);
		client.setEnderešo("Estado de Curitiba");
		client.setCPF(193.000);
		
		System.out.println(client.getNome());
		System.out.println(client.getIdade());
		System.out.println(client.getEnderešo());
		System.out.println(client.getCPF());
		

	}

}
