package br.com.viktor.exceptions.cliente;
import javax.swing.*;

public class AppCliente {
	public static void main(String args[]) {
		String opcao = JOptionPane.showInputDialog(null,"Digite o código do cliente: ","",JOptionPane.INFORMATION_MESSAGE);
		
		try {
			ClienteService.consutarCliente(opcao);
		} catch(ClienteNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}


