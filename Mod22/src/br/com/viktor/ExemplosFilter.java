package br.com.viktor;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().populaPessoa();
		Stream<Pessoa> streamBr = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
		
		Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil");
		Stream<Pessoa> streamPred = lista.stream().filter(pred);
		
		Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
			@Override
			public boolean test(Pessoa pessoa) {
				return pessoa.getNacionalidade().equals("Brasil");
			}
		};
		
		Stream<Pessoa> streamPred1 = lista.stream().filter(pred1);
	}
}
