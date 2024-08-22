package br.com.viktor.annotation;
import java.lang.annotation.*;

@PrimeiraAnotacao("Victor") // TYPE

public class ClasseComAnotacao {
	
	@PrimeiraAnotacao("Zaparoli")  //FIELD
	private String nome;
}
