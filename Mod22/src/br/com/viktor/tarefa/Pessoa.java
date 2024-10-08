package br.com.viktor.tarefa;

public class Pessoa {
	private static int sequence=0;
	private int id;
	private String nome;
	private String genero;
	
	public Pessoa(String nome, String genero) {
		super();
		this.id = sequence++;
		this.nome = nome;
		this.genero = genero;
	}
	
	public Pessoa(String str) {
		this.nome = str.split("-")[0];
		this.genero = str.split("-")[1];
		this.id = sequence++;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", genero=" + genero + "]";
	}
	
	
	
	
	
	
	
	
	
}
