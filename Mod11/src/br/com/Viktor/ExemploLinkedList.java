package br.com.Viktor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

	/**
	 * Ao contrário do ArrayList, as buscas são lentas e inserções e exclusões são rápidas.
	 * **/

public class ExemploLinkedList {
	
	public static void main(String args[]) {
		exemploListaSimples();
		
	}

	private static void exemploListaSimples() {
		List<String> lista = new LinkedList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lucia Ferreira");
		System.out.println(lista);
		System.out.println("");
		
	}
}
