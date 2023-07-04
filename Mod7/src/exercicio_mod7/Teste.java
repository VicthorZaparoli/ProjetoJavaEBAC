package exercicio_mod7;

public class Teste {
	
	/** 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		ClienteDDDEZ cliente = new ClienteDDDEZ();
		cliente.setNomeFantasia("Restaurante do Zé");
		cliente.setCodigo(01);
		cliente.setCnpj("12.345.678/0009-10");
		System.out.print("Nome Fantasia: " + cliente.getNomeFantasia() + "\nCódigo Cliente: " + cliente.getCodigo() + "\nCNPJ: " + cliente.getCnpj());
		System.out.print("\n" + cliente.ultimoCertificado());
	}

}
