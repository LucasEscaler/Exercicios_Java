package exercicios5;

public class testePatinete {

	public static void main(String[] args) {
		
		patinete pat = new patinete();
		
		pat.setModelo("Modelo com motor");
		pat.setCor("Cor azul");
		pat.setTamanho("Tamanho Médio");
		pat.setValor(900);
		pat.setVelocidadeAtual(0);
		pat.setVelocidadeMaxima(40);
		
		System.out.println(pat.getModelo());
		System.out.println(pat.getCor());
		System.out.println(pat.getTamanho());
		System.out.println(pat.getValor() + " Reais");
		
		pat.acelera(20);
		
		System.out.println( "O patinete esta andando");
		System.out.println(pat.getVelocidadeAtual() + " é Velocidade atual ");

	}

}
