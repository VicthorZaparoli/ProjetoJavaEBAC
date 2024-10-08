package br.com.viktor;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OPtional {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new Pessoa().populaPessoa();
		
		Optional<Pessoa> opcional = pessoas.stream()
				.max(Comparator.comparing(Pessoa::getIdade));
		
		if(opcional.isPresent()) {
			System.out.println(opcional.get());
		}
		
		opcional.ifPresent(System.out::println); // Mesma coisa que o de cima.
		
		Optional<Pessoa> opcional2 = pessoas.stream()
				.min(Comparator.comparing(Pessoa::getIdade));
		
		if(opcional.isPresent()) {
			System.out.println(opcional2.get());
		}
		
		opcional2.ifPresent(System.out::println); // Mesma coisa que o de cima.
	}
}
