package br.com.viktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosCollect {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new Pessoa().populaPessoa();

		List<Pessoa> lista_b = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
				.collect(Collectors.toList()); // Collect retorna a lista

		lista_b.forEach(System.out::println);

		System.out.println("***********");

		pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).collect(Collectors.toList())
				.forEach(System.out::println); // Aqui já vai apra a impressão direto.

		System.out.println("***********");

		Set<Pessoa> lista_set = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
				.collect(Collectors.toSet());

		lista_set.forEach(System.out::println);

		System.out.println("***********");

		ArrayList<Pessoa> lista_array = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
				.collect(Collectors.toCollection(ArrayList::new));
		lista_array.forEach(System.out::println);

		System.out.println("***********");

		Map<Integer, Pessoa> lista_map = pessoas.stream().filter(pessoa -> pessoa.getIdade() < 40)
				.collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

		lista_map.forEach((k, v) -> System.out.println(v));

		System.out.println("***********");

		Map<Integer, List<Pessoa>> agrupaPorIdade = pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getIdade));

		agrupaPorIdade.forEach((k, v) -> System.out.println(k + " / " + v));

		System.out.println("***********");

		Map<String, Integer> agrupaPorNacioSomandoIdades = pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getNacionalidade,
						Collectors.summingInt(Pessoa::getIdade)));	

		agrupaPorNacioSomandoIdades.forEach((k, v) -> System.out.println(k + " / " + v));
	
	}

}
