package exercicio1e2;

public class cachorro implements animal {

	@Override
	public void nomeAnimal() {
		System.out.println("O nome do cachorro � floco");
		
	}

	@Override
	public void idadeAnimal() {
		System.out.println("O cachorro tem 7 anos");
		
	}

	@Override
	public void somAnimal() {
		System.out.println("O cachorro late: AU AU!");
		
	}

	@Override
	public void corridaAnimal() {
		System.out.println("O cachorro est� correndo...");
		
	}

	@Override
	public void subindoArvore() {
		System.out.println("Cachorros n�o sobem em arvores");
	}

}
