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
	
	/** Inserir codigo do cliente no sistema.
	 * 
	 * @param codigo 
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/** Retorna o código do cliente
	 * 
	 * @return
	 */
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
	
	
	/** Inserir a razao social.
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
	
	/** Inserir o nome fantasia do cliente.
	 * 
	 * @param nomeFantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/** Retorna o endereço do cliente.
	 * 
	 * @return
	 */
	public String getEndereco() {
		return endereco;
	}

	/** Inserir o endereço do cliente.
	 *  
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
	/** Retorna o último certifico do cliente
	 * 
	 * @return
	 */
	public String ultimoCertificado() {
		return "CERTIFICADO VALIDO!";
	} 

}