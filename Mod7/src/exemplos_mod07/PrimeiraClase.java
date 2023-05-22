/**
 * 
 */
package exemplos_mod07;

/**
 * @author Victo
 *
 */
public class PrimeiraClase {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Olá Victor!");
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua 12");
		cliente.setCodigo(25);
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getCodigo());
		
	}
}
