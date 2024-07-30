package br.com.viktor.observer;

public class Demo {
		public static void main(String args[]) {
			Jornalista jor = new Jornalista();
			jor.add(new TV());
			jor.add(new Jornal());
			jor.notifyAll("TESTE");
		}
}
