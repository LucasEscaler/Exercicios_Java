package exercicio1e2;

public class testeAnimais {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro();
		cavalo horse = new cavalo();
		preguiça preg = new preguiça();
		
		dog.setNome("O nome do cachorro é: Floquinho");
		dog.setIdade(5);
		dog.setSom("Latido: AU AU!");
		dog.setCorrida(15);
		
		horse.setNome("O nome do cavalo é Steve");
		horse.setIdade(10);
		horse.setSom("Relinchar: HINN IN IN!");
		horse.setCorrida(40);
		
		preg.setNome("O nome da preguiça é Bob");
		preg.setIdade(4);
		preg.setSom("zzzz...");
		preg.setSubirNaArvore("Escalando...");
		
		System.out.println(dog.getNome());
		System.out.println(dog.getIdade() + " Anos");
		System.out.println(dog.getSom());
		System.out.println(dog.getCorrida() + " Kmh");
		
		System.out.println("======================");

		System.out.println(horse.getNome());
		System.out.println(horse.getIdade() + " Anos");
		System.out.println(horse.getSom());
		System.out.println(horse.getCorrida() + " Kmh");
		
		System.out.println("======================");
		
		System.out.println(preg.getNome());
		System.out.println(preg.getIdade() + " Anos");
		System.out.println(preg.getSom());
		System.out.println(preg.getCorrida() + " Kmh");
		System.out.println(preg.getSubirNaArvore());
	}

}
