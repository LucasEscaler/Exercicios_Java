package exercico3;

public class testeVideoGame {

	public static void main(String[] args) {
		videoGame game = new videoGame();
		
		game.setConsole("O console é um: Playstation");
		game.setMarca("A marca é: Sony");
		game.setRAM(500);
		game.setPreço(5000);
		
		System.out.println(game.getConsole());
		System.out.println(game.getMarca());
		System.out.println(game.getRAM() + "GB de Memória RAM");
		System.out.println(game.getPreço() + " Reais");

	}

}
