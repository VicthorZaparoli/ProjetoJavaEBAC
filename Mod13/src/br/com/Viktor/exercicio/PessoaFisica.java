package br.com.Viktor.exercicio;

import java.time.LocalDate;

class PessoaFisica extends Pessoa {
    protected long cpf;

    public PessoaFisica(String nome, LocalDate dataNascimento, long cpf) {
        super(nome, dataNascimento);
        this.cpf = cpf;
    }

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
