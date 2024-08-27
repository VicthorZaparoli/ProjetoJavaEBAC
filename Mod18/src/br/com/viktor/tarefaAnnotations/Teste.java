package br.com.viktor.tarefaAnnotations;
import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Teste {
	public static void main(String[] args) {
		ClasseTabela tabela = new ClasseTabela();
		
		Class clazz = tabela.getClass();
		System.out.println();
		Annotation[] annotations = clazz.getAnnotations(); 
		for( Annotation an: annotations) {
			System.out.println(an.annotationType() + "!!!");
		}
		for(Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(Tabela.class)) {
				Tabela nome = field.getAnnotation(Tabela.class);
				System.out.println(nome.toString());
				System.out.println(nome.value());
			}
		}
	}
}
