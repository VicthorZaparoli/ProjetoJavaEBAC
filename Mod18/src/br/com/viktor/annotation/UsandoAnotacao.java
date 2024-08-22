package br.com.viktor.annotation;
import java.lang.annotation.RetentionPolicy;

@ExemploAnotacao(value = "Victor", nomes= {"Victor"}, value2 = {RetentionPolicy.RUNTIME}, value3 = RetentionPolicy.RUNTIME)
public class UsandoAnotacao {
	private String nome;

	@Override
	public String toString() {
		return "UsandoAnotacao [nome=" + nome + "]";
	}
	
	
}
