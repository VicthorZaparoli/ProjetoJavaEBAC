package br.com.Viktor.forWhile;

import java.util.Scanner;

public class Tabuada {
	public static void main(String arg[]) {
		int numero = getNum();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " * " + numero + " = " + i * numero);
		}

	}

	private static int getNum() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = s.nextInt();
		return num;
	}
}
