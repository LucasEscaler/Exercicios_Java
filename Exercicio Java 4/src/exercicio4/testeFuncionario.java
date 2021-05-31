package exercicio4;

public class testeFuncionario {

	public static void main(String[] args) {
		
		funcionario func = new funcionario();
		
		func.setNome("O nome do funcionario é Junior");
		func.setIdade(18);
		func.setFuncao("Junior é ajudante geral");
		func.setHorasTrabalhadas(40);
		func.setSalario(1500);
		
		System.out.println(func.getNome());
		System.out.println(func.getIdade() + " Anos");
		System.out.println(func.getFuncao());
		System.out.println(func.getHorasTrabalhadas() + " Horas trabalhadas");
		System.out.println(func.getSalario() + " Reais");
				

	}

}
