package br.com.viktor.observer;

public class TV implements Observer {

	public void update(Subject subject) {
		System.out.println("Recebendo a notícia via TV " + subject.toString());
		
	}

}
