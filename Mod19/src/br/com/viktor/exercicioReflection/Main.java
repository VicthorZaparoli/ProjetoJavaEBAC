package br.com.viktor.exercicioReflection;

import java.lang.reflect.*;

public class Main {
	public static void main(String[] args) {
		ClassTabela tab = new ClassTabela();
		Field[] fields = tab.getClass().getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
			if(field.isAnnotationPresent(Tabela.class)){
				Tabela nome = field.getAnnotation(Tabela.class);
				System.out.println(nome.value() + " / " + nome.toString());
			}
		}
	}
}
