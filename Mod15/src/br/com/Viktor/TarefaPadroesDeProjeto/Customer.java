package br.com.Viktor.TarefaPadroesDeProjeto;

public class Customer {
	private String nome;
	private boolean isLuxCar;
	public Customer(String nome, boolean isLuxCar) {
		this.nome = nome;
		this.isLuxCar = isLuxCar;
	}
	public String getNome() {
		return nome;
	}
	public boolean isLuxCar() {
		return isLuxCar;
	}
	
	
}
