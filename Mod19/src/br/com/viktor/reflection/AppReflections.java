package br.com.viktor.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AppReflections {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class clazz = Produto.class;

		System.out.println(clazz);

		Produto prod = new Produto(); // Instanciando a classe
		Class clazz1 = prod.getClass();
		System.out.println(clazz1);
		
		try {
			Constructor cons = clazz.getConstructor();  //Tive que remover os parâmetros do construtor para que o programa rodasse.
			Produto prod1 = (Produto) cons.newInstance();
			System.out.println(cons);
			System.out.println(prod1);
			
			Field[] fields = prod1.getClass().getDeclaredFields();
			for( Field field : fields) {
				Class<?> type = field.getType();
				String nome = field.getName();
				System.out.println(type + " / " + nome);
			}
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
