package exercico3;

public class testeVideoGame {

	public static void main(String[] args) {
		videoGame game = new videoGame();
		
		game.setConsole("O console � um: Playstation");
		game.setMarca("A marca �: Sony");
		game.setRAM(500);
		game.setPre�o(5000);
		
		System.out.println(game.getConsole());
		System.out.println(game.getMarca());
		System.out.println(game.getRAM() + "GB de Mem�ria RAM");
		System.out.println(game.getPre�o() + " Reais");

	}

}
