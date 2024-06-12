package br.com.Viktor.TarefaPadroesDeProjeto;

public class VehicleFactory {
	private static CarLuxVehicle getLuxVehicle() {
		CarLuxVehicle vehicle = new CarLuxVehicle("Volkswagem","Gol Bolinha 1996");
		return vehicle;
	}
	
	private static CarBasicVehicle getBasicVehicle() {
		CarBasicVehicle vehicle = new CarBasicVehicle("Mercedes-benz","Classe A");
		return vehicle;
	}
	
	public static Object CustomerChoice(boolean isLuxCar) {
		if(isLuxCar) {
			return getLuxVehicle();
		} else {
			return getBasicVehicle();
		}
		
	}
}
