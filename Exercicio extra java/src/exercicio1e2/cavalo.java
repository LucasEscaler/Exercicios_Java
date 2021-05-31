package exercicio1e2;

public class cavalo implements animal {

	@Override
	public void nomeAnimal() {
		System.out.println("O nome do cavalo é steve");
		
	}

	@Override
	public void idadeAnimal() {
		System.out.println("O cavalo tem 4 anos");
		
	}

	@Override
	public void somAnimal() {
		System.out.println("O cavalo faz: HI HIM HIM!");
		
	}

	@Override
	public void corridaAnimal() {
		System.out.println("O cavala está correndo muito rapido!");
		
	}

	@Override
	public void subindoArvore() {
		System.out.println("Cavalos não sobem em arvores");
		
	}

}
