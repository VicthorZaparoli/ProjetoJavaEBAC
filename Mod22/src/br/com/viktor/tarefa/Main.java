package br.com.viktor.tarefa;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Pessoa> ListaPessoas = new LinkedList<Pessoa>();

		System.out.println("Digite o nome da pessoa seguido pelo gênero. Ex: Pedro-M,Maria-F");
		String[] pessoas = new Scanner(System.in).next().split(",");

		for (int i = 0; i < pessoas.length; i++) {
			ListaPessoas.add(new Pessoa(pessoas[i]));
		}

		ListaPessoas.forEach(pessoa -> System.out.println(pessoa.toString()));

		List<Pessoa> mulheres = ListaPessoas.stream()
				.filter(pessoa -> pessoa.getGenero().equals("F"))
				.collect(Collectors.toList());

		System.out.println(mulheres);

	}
}
