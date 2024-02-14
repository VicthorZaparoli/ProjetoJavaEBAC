package br.com.Viktor.exercicio;

public class Pessoa {
	
	String nome;
	String sexo;
	Integer id;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pessoa(String nome, String sexo, Integer id) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.id = id;
	}

}
