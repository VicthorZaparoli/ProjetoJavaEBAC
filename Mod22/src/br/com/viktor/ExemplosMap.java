package br.com.viktor;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().populaPessoa();
		
		Stream<Integer> stream = lista.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
				.map(Pessoa::getIdade);
		
		IntStream stream1 = lista.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) 
				.mapToInt(Pessoa::getIdade);
		
		
	}
}
