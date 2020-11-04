package Decorator;

public class Americano extends Beverage {
	@Override
	public String getDescription() {
		return "Mała czarna";
	}
	
	@Override
	public double cost() {
		return 2.1;
	}
}
