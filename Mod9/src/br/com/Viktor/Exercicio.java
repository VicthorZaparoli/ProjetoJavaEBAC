package br.com.Viktor;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		Exibir(Leitura());
	}
	
	private static int Leitura() {
		
		Scanner ler = new Scanner(System.in);	
		int numero;								// Tipo primitivo 
		System.out.printf("Valor: ");
		numero = ler.nextInt();
		numero = Integer.valueOf(numero);		// Tipo Wapper
		return numero;
	}
	
	private static void Exibir(int i) {
		System.out.println(i);
		System.out.println(((Object)i).getClass().getSimpleName()); //Verificando tipo da variável.
		
	}
	
}
