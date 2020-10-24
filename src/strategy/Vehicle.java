package strategy;

public class Vehicle {
	private RunStrategy runStrategy;
	
	public Vehicle(RunStrategy runStrategy) {
		this.runStrategy = runStrategy;
	}
	
	public void run() {
		runStrategy.run();
	}
	
	public void setRunStrategy(RunStrategy runStrategy) {
		this.runStrategy = runStrategy;
	}
}
