//Reflexão (Reflection)) --> Manipular Classes, podendo pegar seus construtores,métodos,
//instanciar objetos por reflection,

package br.com.viktor.reflection;

public class Produto {
	
	private Long codigo;
	
	private String descricao;
	
	private Double valor;

	public Produto() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
