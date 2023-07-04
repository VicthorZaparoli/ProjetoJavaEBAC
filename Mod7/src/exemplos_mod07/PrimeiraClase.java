package exemplos_mod07;

public class PrimeiraClase {

	public static void main(String args[]) {
		System.out.println("Olá Victhor, pra cima deles!");
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua DDDEZ");
		cliente.setCodigo(25);
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getCodigo());

	}
}
