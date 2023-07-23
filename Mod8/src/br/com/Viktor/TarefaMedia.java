package br.com.Viktor;

public class TarefaMedia {
	
	public static void main(String[] args) {
		double num1 = Double.valueOf(args[0]).doubleValue();
		double num2 = Double.valueOf(args[1]).doubleValue();
		double num3 = Double.valueOf(args[2]).doubleValue();
		double num4 = Double.valueOf(args[3]).doubleValue();
		Media(num1, num2, num3, num4);
	}

	private static void Media (double nota1, double nota2, double nota3, double nota4) {
		System.out.println("Media: " + (nota1 + nota2 + nota3 + nota4) / 4);
	}

}
