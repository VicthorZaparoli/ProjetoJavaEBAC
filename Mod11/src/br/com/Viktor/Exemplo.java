package br.com.Viktor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo {
	public static void main(String args[]) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();
		exemploNumeros();
		

	}

	private static void exemploListaSimples() {
		System.out.println("***** ExemploListaSimples *****");
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		System.out.println(lista);
		System.out.println("");
	}

	private static void exemploListaSimplesOrdemAscendente() {
		System.out.println("***** ListaSimplesOrdemAscendente *****");
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");

	}

	private static void exemploNumeros() {
		System.out.println("***** ExemploNumeros *****");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(3);
		System.out.println(numeros);
		
	}
}
