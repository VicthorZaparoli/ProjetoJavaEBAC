package br.com.viktor.exercicio;
import java.util.List;

public class Demo {
	public static void main(String args[]) {
		Chevrolet x = new Chevrolet("Chevrolet");
		Celta i = new Celta("Celta",20000.00, "FireV8", x, 2006, false, true );
		Onix y = new Onix("Onix",40000.00, "Motor", x, 2012, true, true );
		x.listarCarros();
		System.out.println(x.carIsRegistered("Onix"));
	}
}
