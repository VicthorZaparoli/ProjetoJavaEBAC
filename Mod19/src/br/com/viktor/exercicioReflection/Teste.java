package br.com.viktor.exercicioReflection;

import java.util.Arrays;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		Gato gato = new Gato("Lisa", 1);
		gato.meow();
		method(() -> { System.out.println("Meow"); });  
		InterfaceFuncional varx = () -> System.out.println("Meow Varx");
		method(varx);
		varx.print();
		Runnable runnable = () -> System.out.println("Executando uma tarefa");
		runnable.run();
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream()
		     .filter(name -> name.startsWith("A"))
		     .forEach(System.out::println);
		
	} 
	
		

	private static void method(InterfaceFuncional objeto) {
		objeto.print();
	}
	
	private static String inverteString(String str) {
		String newStr = "";
		for(int i = 0; i<str.length(); i++) {
			newStr+= str.charAt( (str.length() - 1) - i);
		}
		return newStr;
		}
	 
}
