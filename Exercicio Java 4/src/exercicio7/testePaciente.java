package exercicio7;

public class testePaciente {
	
	public static void main (String args[]) {
	paciente pac = new paciente();
	
	pac.setNome("O paciente se chama Will");
	pac.setIdade(20);
	pac.setCPF(404.192);
	pac.setCidade("São Paulo");
	pac.setSintomas("Tosse, febre, dor de cabeça e dores corporais");
	pac.setDiagnostico("Will está com virose");
	
	System.out.println(pac.getNome());
	System.out.println(pac.getIdade() + " Anos");
	System.out.println(pac.getCPF() + ": É seu CPF");
	System.out.println(pac.getCidade() + ": É sua cidade natal");
	System.out.println(pac.getSintomas() + ": Sintomas sentidos pelo paciente");
	System.out.println(pac.getDiagnostico());
	System.out.println("Rochelle o mandou tomar um xarope!");
		
	

}
}
