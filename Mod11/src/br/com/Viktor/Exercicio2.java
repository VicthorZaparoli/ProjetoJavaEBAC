package br.com.Viktor;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio2 {
	public static void main(String args[]) {
		List<String> pessoas = new ArrayList<String>(); // Luana-F, João-M, Tijolo-M
		List<String> homens = new ArrayList<String>(); //
		List<String> mulheres = new ArrayList<String>(); //
		Scanner ler = new Scanner(System.in);

		System.out.print("Nomes: ");
		String nomes = ler.nextLine();
		String[] textoSeparado = nomes.replace(" ", "").split(",");
		for (Integer i = 0; i < textoSeparado.length; i++) {
			pessoas.add(textoSeparado[i]);
			// System.out.println(textoSeparado[i].contains("-M"));
			if (textoSeparado[i].contains("-M") == true) {
				homens.add(textoSeparado[i]);
			} else { mulheres.add(textoSeparado[i]); }
		}
		Collections.sort(pessoas);
		System.out.println(pessoas + "\n" + homens + "\n" + mulheres);
	}

}
