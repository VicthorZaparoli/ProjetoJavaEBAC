package br.com.viktor.exercicio;

public abstract class Carro {
	String nome;
	Double preco;
	String motor;
	Montadora montadora;
	Integer ano;
	Boolean abs;
	Boolean ar;
	
	public Carro(String modelo, Double preco, String motor, Montadora montadora, Integer ano, Boolean abs, Boolean ar) {
		this.nome = modelo;
		this.preco = preco;
		this.motor = motor;
		this.montadora = montadora;
		this.ano = ano;
		this.abs = abs;
		this.ar = ar;
		montadora.addCarro(this);
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", preco=" + preco + ", motor=" + motor + ", montadora=" + montadora.toString() + ", ano="
				+ ano + ", abs=" + abs + ", ar=" + ar + "]";
	}




	
}
