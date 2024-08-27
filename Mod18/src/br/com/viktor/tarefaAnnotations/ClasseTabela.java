package br.com.viktor.tarefaAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class ClasseTabela {

	@Tabela(value="TabelaProdutos") 
	String nome;

	public ClasseTabela() {
	}

	public String getNome() {
		return nome;
	}

}
