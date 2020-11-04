package Decorator;

public class OnTheHouseDecorator extends BeverageDecorator {
	private Beverage beverage;
	
	public OnTheHouseDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ". Na koszt firmy!";
	}
	
	@Override
	public double cost() {
		return 0;
	}
}
