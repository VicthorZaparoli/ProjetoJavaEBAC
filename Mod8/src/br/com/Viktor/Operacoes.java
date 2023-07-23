package br.com.Viktor;

public class Operacoes {
	
	public static void main (String args[]) {
		operacoesAritmeticas();
		operacoesAtribuicoes();
		operacoesIncrementoDecremento();
		
	}
	
	public static void operacoesRelacionais() {
		System.out.println("**** Operacoes Relacionais ****");
	}
	
	public static void operacoesIncrementoDecremento() {
		System.out.println("**** Operacoes Incremento e Decremento ****");
		int numero1 = 10;
		numero1++;
		System.out.println(numero1);
		numero1--;
		System.out.println(numero1);
		
	}
	
	public static void operacoesAtribuicoes() {
		System.out.println("**** Opercoes Atribuicoes ****");
		int numero1 = 10;
		int numero2 = 10;
		int numero3 = numero1 + numero2;
		System.out.println(numero3);
		numero3 += numero3;
		int numero4 = numero3 + 20;
		System.out.println(numero3);
		System.out.println(numero4);
	}
	
	public static void operacoesAritmeticas() {
		System.out.println("**** Operacoes Aritmeticas ****");
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		int num7 = (10 + 14) / 2;  
		
		System.out.println(num7);
		
	}

}
