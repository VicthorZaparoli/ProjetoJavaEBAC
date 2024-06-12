package br.com.Viktor.TarefaPadroesDeProjeto;

public class CarBasicVehicle extends BasicVehicle {

	private String marca;
	private String modelo;

	public CarBasicVehicle(String marca, String modelo) {
		super(marca, modelo);
		this.marca = marca;
		this.modelo = modelo;
	}
	

	public String getMarca() {
		return marca;
	}



	public String getModelo() {
		return modelo;
	}



	public String toString() {
		return "CarBasicVehicle [marca= " + marca + ", modelo= " + modelo + ", tipo= " + this.getClass().getSimpleName() + "]";
	}
	
}
