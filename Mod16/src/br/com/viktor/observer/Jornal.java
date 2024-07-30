package br.com.viktor.observer;

public class Jornal implements Observer {

	public void update(Subject subject) {
		System.out.println("Recebendo a notícia via Jornal " + subject.toString());}

}
