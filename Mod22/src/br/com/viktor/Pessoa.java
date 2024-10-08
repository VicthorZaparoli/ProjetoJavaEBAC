package br.com.viktor;

import java.util.List;

public class Pessoa {
	private String id;
	private String nome;
	private String nacionalidade;
	private int idade;

	public Pessoa() {}

	public Pessoa(Pessoa pessoa) {
		this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade());
	}

	public Pessoa(String id, String nome, String nacionalidade, int idade) {
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Pessoa> populaPessoa() {
		Pessoa pessoa1 = new Pessoa("p1", "Matheus", "Brasil", 18);
		Pessoa pessoa2 = new Pessoa("p2", "Clara", "Mexico", 22);
		Pessoa pessoa3 = new Pessoa("p3", "Jorge", "Italia", 35);
		Pessoa pessoa4 = new Pessoa("p4", "Zeca", "Brasil", 56);
		Pessoa pessoa5 = new Pessoa("p5", "Valdir", "Brasil", 56);
		return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + "]";
	}

}
