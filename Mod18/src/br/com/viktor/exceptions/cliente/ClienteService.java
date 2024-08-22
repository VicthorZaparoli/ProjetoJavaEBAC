package br.com.viktor.exceptions.cliente;

public class ClienteService {

	public static void consutarCliente(String codigo) throws ClienteNaoEncontradoException {
		//Busca no banco
		boolean isCadastrado = false;
		
		if(!isCadastrado) {
			throw new ClienteNaoEncontradoException("Cliente não encontado.");
		}
	}

}
