package br.com.Viktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Aluno2 a = new Aluno2();
        a.setName("Adolfo");
        a.setIdade(15);
        a.setNotas(6.0);
        a.setNotas(7.0);
        System.out.println(a);
    }
}
 
class Aluno2 {
    private String name;
    private Integer idade;
    private List<Double> notas = new ArrayList<Double>();
    
	public String toString() {
		return "Aluno2 [name=" + name + ", idade=" + idade + ", notas=" + notas + "]";
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade(){
		return idade;
	}

	public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNotas(Double nota) {
        notas.add(nota);
    }
    
    public List<Double> getNotas() {
        return notas;
    }
}
