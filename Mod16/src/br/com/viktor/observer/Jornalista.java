package br.com.viktor.observer;

import java.util.List;
import java.util.ArrayList;

public class Jornalista implements Subject {
	public List<Observer> observers = new ArrayList<>();
	
	private String titulo;

	public void add(Observer observer) {
		observers.add(observer);
	};

	public void remove(Observer observer) {
		observers.remove(observer);
	};

	public void notifyAll(String titulo) {
		this.titulo = titulo;
		for (Observer ob : this.observers) {
			ob.update(this);
		}
	}

	@Override
	public String toString() {
		return "Jornalista [titulo=" + titulo + "]";
	}
	
	
}
