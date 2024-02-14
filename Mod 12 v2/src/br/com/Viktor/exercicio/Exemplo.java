package br.com.Viktor.exercicio;

import java.util.*;

public class Exemplo {
	private static int proximoId = 1;

	public static void main(String args[]) {
		Map<Integer, Pessoa> listaHomen = new HashMap<>();
		Map<Integer, Pessoa> listaMulher = new HashMap<>();
		Map<Integer, Pessoa> lista = new HashMap<>();
		addPessoa(lista, listaHomen, listaMulher);

		System.out.println("\n***Lista das Pessoas:***");
		for (Pessoa i : lista.values()) {
			System.out.print("Nome: " + i.getNome() + " |");
			System.out.print("Sexo: " + i.getSexo() + " |");
			System.out.println("Id: " + i.getId() + " |");
		}
		;
		System.out.println("\n***Lista dos Homens:***");
		for (Pessoa i : listaHomen.values()) {
			System.out.print("Nome: " + i.getNome() + " |");
			System.out.print("Sexo: " + i.getSexo() + " |");
			System.out.println("Id: " + i.getId() + " |");
		}
		;
		System.out.println("\n***Lista das Mulheres:***");
		for (Pessoa i : listaMulher.values()) {
			System.out.print("Nome: " + i.getNome() + " |");
			System.out.print("Sexo: " + i.getSexo() + " |");
			System.out.println("Id: " + i.getId() + " |");
		}
		;
	};

	private static Pessoa metodo() {
		Scanner ler = new Scanner(System.in);
		String nome;
		do {
			System.out.print("Digite o nome: ");
			nome = ler.nextLine();
			if (nome.contains(" ") || nome.contains("")) {
				System.out.println("Erro: Coloque um nome válido.");
				continue;
			}
		} while (nome.equals("") || nome.contains(" "));
		String sexo = "";
		do {
			System.out.print("Digite o sexo, 'M' para masculino e 'F' para feminino: ");
			sexo = ler.nextLine().toLowerCase();
			if(!sexo.equals("m") && !sexo.equals("f")) {
				System.out.println("Erro: Coloque um sexo válido.");
				continue;
			}
		} while (!sexo.equals("m") && !sexo.equals("f"));

		Pessoa pessoa = new Pessoa(nome, sexo, proximoId);
		proximoId++;

		return pessoa;
	}

	public static void addPessoa(Map<Integer, Pessoa> lista, Map<Integer, Pessoa> listaHomen,
			Map<Integer, Pessoa> listaMulher) {
		String opcao = "";
		do {
			Pessoa pessoa = metodo();
			lista.put(pessoa.getId(), pessoa);
			if (pessoa.getSexo().equals("m")) {
				listaHomen.put(pessoa.getId(), pessoa);
			} else {
				listaMulher.put(pessoa.getId(), pessoa);
			}
			Scanner ler = new Scanner(System.in);
			System.out.print("Deseja inserir mais pessoas? Responda S para Sim ou N para Não: ");
			opcao = ler.nextLine().toLowerCase();
		} while (!opcao.equals("n"));
	}
};
