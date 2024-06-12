package br.com.Viktor.builder;

public class Demo {
	public static void main (String[] args) {
		BurgerResturantDirector burgerResturant = new BurgerResturantDirector();
		burgerResturant.setBuilder(new CheeseBurgerBuilder());
		buildBurger(burgerResturant);
		
		burgerResturant.setBuilder(new VeganBurgerBuilder());
		buildBurger(burgerResturant);
	}

	private static void buildBurger(BurgerResturantDirector burgerResturant) {
		Burger burger = burgerResturant.buildeBurger();
		burger.print();
		
	}
}
