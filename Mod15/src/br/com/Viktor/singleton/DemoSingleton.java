package br.com.Viktor.singleton;

public class DemoSingleton {
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(singleton1); //Retorna o mesmo objeto, só pode ser instanciado uma única vez.
		
	}

}
