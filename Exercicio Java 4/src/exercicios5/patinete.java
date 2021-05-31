package exercicios5;

public class patinete {

	private String cor;
	private String modelo;
	private String tamanho;
	private double valor;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	void anda() {
	System.out.println("O patinete está andando...");
	}
	void acelera(double aceleracao) {
	
	double velocidadeNova = this.velocidadeAtual+aceleracao;
	this.velocidadeAtual = velocidadeNova;}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
}
