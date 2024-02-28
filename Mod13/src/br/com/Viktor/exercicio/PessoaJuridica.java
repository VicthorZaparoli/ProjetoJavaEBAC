package br.com.Viktor.exercicio;

class PessoaJuridica extends Pessoa {
    protected long cnpj;
    protected String razaoSocial;
    protected PessoaFisica representanteLegal;

    public PessoaJuridica(long cnpj, String razaoSocial, PessoaFisica representanteLegal) {
        super(representanteLegal.nome, representanteLegal.dataNascimento);
        this.cnpj = cnpj;
        this.representanteLegal = representanteLegal;
        this.razaoSocial = razaoSocial;
    }

    public String toString() {
        return "PessoaJuridica [" +
                "razaoSocial=" + razaoSocial +
                ", cnpj=" + cnpj +
                ", representanteLegal=" + representanteLegal.getNome() +
                ", representanteLegalDataNascimento=" + representanteLegal.getDataNascimento() +
                ']';
    }

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(PessoaFisica representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

}
