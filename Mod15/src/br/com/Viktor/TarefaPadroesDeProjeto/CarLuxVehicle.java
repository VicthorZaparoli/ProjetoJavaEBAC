package br.com.Viktor.TarefaPadroesDeProjeto;

public class CarLuxVehicle extends LuxVehicle {
	
	private String marca;
	private String modelo;

	public CarLuxVehicle(String marca, String modelo) {
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
		return "CarLuxVehicle [marca= " + marca + ", modelo= " + modelo + ", tipo= " + this.getClass().getSimpleName() +"]";
	}
	
	
}
