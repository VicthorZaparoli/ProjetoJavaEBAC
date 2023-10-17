package br.com.Viktor;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio {
	public static void main(String args[]) {
		List<String> pessoas = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);

		System.out.print("Nomes: ");
		String nomes = ler.nextLine();
		String[] textoSeparado = nomes.replace(" ", "").split(",");
		for (Integer i = 0; i < textoSeparado.length; i++) {
			pessoas.add(textoSeparado[i]);
		}
		Collections.sort(pessoas);
		System.out.println(pessoas);
	}

}
