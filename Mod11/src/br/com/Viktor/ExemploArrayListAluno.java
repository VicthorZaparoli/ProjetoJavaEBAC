package br.com.Viktor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
	
	public static void main(String args[]) {
		exemploListaSimplesOrdenadasComparadasAlunos();
		exemploListaSimplesOrdenadasComparadasExterno();
	}

	private static void exemploListaSimplesOrdenadasComparadasAlunos() {
		System.out.println("***** exemploListaSimplesOrdenadasComparadasAlunos  *****");
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João da Silva", "Linus básico", 20);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
		Aluno c = new Aluno("Lúcia Ferrera", "Internet", 10);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		System.out.println("Lista sem ordenação: " + lista);
		Collections.sort(lista);
		System.out.println("");
		System.out.println("Lista com ordenação: " + lista);
		
	}
	
	private static void exemploListaSimplesOrdenadasComparadasExterno() {
		List<Aluno> lista = new ArrayList<Aluno>();
		
		
	}

}
