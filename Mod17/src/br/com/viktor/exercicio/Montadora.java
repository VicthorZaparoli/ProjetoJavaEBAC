package br.com.viktor.exercicio;

import java.util.*;

public abstract class Montadora {
	String nome;
	List <Carro> modelos_carros = new ArrayList();
	public Montadora(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome ;
	}

	protected void addCarro(Carro carro) {
		modelos_carros.add(carro);
	}
	
	protected void listarCarros() {
		for(Carro carro : modelos_carros) {
			System.out.println(carro.toString());
		}
	}
	
	protected boolean carIsRegistered(String nome1) {
		for(Carro carro : modelos_carros) {
			if(carro.nome == nome1) {
			  return true;
			}
		
		}
		return false;
	}
	

	
}
