package strategy;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(new FlyStrategy());
		
		vehicle.run();
		
		vehicle.setRunStrategy(new DriveStrategy());
		vehicle.run();
	}
}
