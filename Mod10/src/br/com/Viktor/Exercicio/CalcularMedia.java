package br.com.Viktor.Exercicio;

import java.util.Scanner;

public class CalcularMedia {
	public static void main(String args[]) {
		System.out.print(Status(CalculoMedia()));

	}

	private static Double CalculoMedia() {
		Double numero_provas = numeroProvas();
		Double media = 0.0;
		Scanner ler = new Scanner(System.in);
		for (var i = 0; i < numero_provas; i++) {
			System.out.print("Digite a " + (i + 1) + "º" + " nota: ");
			Double nota = ler.nextDouble();
			media += nota;
		}
		;
		media = media / numero_provas;
		return media;

	}

	private static String Status(Double media) {
		String Status = null;
		if (media >= 7) {
			Status = "Aprovado! " + media;
		} else if (media >= 5) {
			Status = "Recuperação! " + media;
		} else if (media < 5) {
			Status = "Reprovado! " + media;
		}
		return Status;
	}

	private static Double numeroProvas() {
		Double numero;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o numero de provas: ");
		numero = ler.nextDouble();
		;
		return numero;
	}

}
