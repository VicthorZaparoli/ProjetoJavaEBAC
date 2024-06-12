package br.com.Viktor.TarefaPadroesDeProjeto;

public class DemoClient {
	public static void main(String[] args) {
		Customer customerLux = new Customer("João",true);
		Customer customerBasic = new Customer("Maria",false);
		VehicleFactory factory = new VehicleFactory();
		Object car = factory.CustomerChoice(customerLux.isLuxCar());
		System.out.println(car.toString());
		Object car2 = factory.CustomerChoice(customerBasic.isLuxCar());
		System.out.println("\n" + car2.toString());
	}
}
