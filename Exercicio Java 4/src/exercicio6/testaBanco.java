package exercicio6;

public class testaBanco {

	public static void main(String[] args) {
		
		contaBanco bank = new contaBanco();
		
		bank.setProprietario("Proprietaria: Bianca");
		bank.setSenha(1998);
		bank.setSaldo(4500);
		bank.setSaldoaTransferir(500);
		bank.setSaldoAtual(4000);
		
		System.out.println(bank.getProprietario());
		System.out.println(bank.getSenha() + " É a senha");
		System.out.println(bank.getSaldo() + " Saldo atual");
		System .out.println(bank.getSaldoaTransferir() + " Valor a transferir");
		System.out.println(bank.getSaldoAtual() + " Saldo atual");
		
		

	}

}