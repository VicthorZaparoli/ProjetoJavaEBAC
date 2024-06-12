package br.com.Viktor.builder;

public class BurgerResturantDirector {
	
	private BurgerBuilder burgerBuilder;
	
	public void setBuilder (BurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}
	
	public Burger buildeBurger() {
		burgerBuilder.buildBun();
		burgerBuilder.buildMeat();
		burgerBuilder.buildSalad();
		burgerBuilder.buildChesse();
		burgerBuilder.buildSauce();
		return burgerBuilder.build();
		
	}
}
