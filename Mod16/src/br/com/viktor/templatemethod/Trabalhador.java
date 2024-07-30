package br.com.viktor.templatemethod;

public abstract class Trabalhador {
	public void executar() {
		iniciarRotina();
		levantar();
		irAoTrabalho();
		trabalhar();
		voltarParaCasa();
	}
	
	protected abstract void trabalhar();
	
	private void voltarParaCasa() {
		System.out.println("Voltando para casa...");
	}

	private void irAoTrabalho() {
		System.out.println("Indo ao trabalho...");
	}

	private void iniciarRotina() {
		System.out.println("Iniciando Rotina...");
	}
	
	protected void levantar() {
		System.out.println("Levantando da cama...");
	}
	
	
}
