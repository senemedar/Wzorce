package Decorator;

public class MilkDecorator extends BeverageDecorator {
	private Beverage beverage;
	
	public MilkDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " z mlekiem";
	}
	
	@Override
	public double cost() {
		return this.beverage.cost() + 0.5;
	}
}
