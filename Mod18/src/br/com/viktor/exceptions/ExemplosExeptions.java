package br.com.viktor.exceptions;

public class ExemplosExeptions {
	public static void main(String[] args) {
		// lancarRuntimeException();
	}

	private static void lancarRuntimeException() {
		try {
			String frase = null;
			String novaFrase = null;
			novaFrase = frase.toUpperCase();
		} catch (Exception e) {
			throw new RuntimeException("Parando o sistema"); // Para seu sistema.
		}
		System.out.println("Teste");
	}

	private static void comTratamentoExceptionComFinally() {
		String frase = null;
		String novaFrase = null;
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("A Frase inicial está nula, foi lhe atribuido um valor.");
		} finally {
			novaFrase = frase.toUpperCase();
		}
	}

	private static void comTratamentoException() {
		String frase = null;
		String novaFrase = null;
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) { // APENAS PARA FINS DIDÁTICOS, NÃO É COMUM TRATAR ESSE ERRO.
			// TRATAMENTO DA EXCEÇÃO
			System.out.println("A Frase inicial está nula, foi lhe atribuido um valor.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

	public static void semTratamentoException() {
		String frase = null;
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}
}
