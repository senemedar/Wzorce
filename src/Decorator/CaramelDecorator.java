package Decorator;

public class CaramelDecorator extends BeverageDecorator {
	private Beverage beverage;
	
	public CaramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " z karmelem";
	}
	
	@Override
	public double cost() {
		return this.beverage.cost() + 0.8;
	}
}
