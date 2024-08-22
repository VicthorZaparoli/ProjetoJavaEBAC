package br.com.viktor.exceptions;

public class AppExemploThrow {

	public static void main(String[] args) {
		// exception();
		runtimeException();
	}

	private static void runtimeException() {
		ExemploThrow.saqueRuntimeException(400);
	}

	private static void exception() {
		try {
			ExemploThrow.saque(500.0);
		} catch (LimiteSaqueException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
