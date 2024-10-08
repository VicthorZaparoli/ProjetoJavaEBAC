package br.com.viktor.exercicioReflection;

public class Gato implements InterfaceFuncional {
	String nome;
	Integer idade;
	
	public void meow() {
		System.out.println("Meow!!!");
	}

	@Override
	public void print() {
		
	}

	public Gato(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
