package br.com.Viktor.exercicio;
import java.time.LocalDate;

public class App {
	
	public static void main(String args[]) {
        PessoaFisica pessoaFisica = new PessoaFisica("José da Silva", LocalDate.of(1999, 2, 5), 12334567890L);
        
        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica(12477300000107L, "Bar do Zé", pessoaFisica);

        System.out.println("\n"+pessoaJuridica);
    }
}

