/**
 * 
 */
package exercicio_mod7;

/**
 * @author Victor
 * 
 * @
 */
public class ClienteDDDEZ {

	private int codigo;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	/** Codigo do cliente no sistema.
	 * 
	 * @param codigo 
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	
	/** Retorna a razao social do cliente.
	 * 
	 * @return
	 */
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	
	/** Método que permite inserir a razao social.
	 * 
	 * @param razaoSocial
	 */
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	/** Retorna o nome fantasia do cliente.
	 * 
	 * @return
	 */

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
	public String ultimoCertificado() {
		return "CERTIFICADO VALIDO!";
	} 

}