package Decorator;

public class Main {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		Beverage americano = new Americano();
		Beverage kawaZkarmelem = new CaramelDecorator(espresso);
		Beverage kawaZmlekiem = new MilkDecorator(espresso);
		Beverage kawaFull = new OnTheHouseDecorator(new MilkDecorator(new CaramelDecorator(americano)));
		
		System.out.println(kawaZkarmelem.getDescription() + "; cena: " + kawaZkarmelem.cost());
		System.out.println(kawaZmlekiem.getDescription() + "; cena: " + kawaZmlekiem.cost());
		System.out.println(americano.getDescription());
		System.out.println(kawaFull.getDescription() + "; cena: " + kawaFull.cost());
		
	}
}
