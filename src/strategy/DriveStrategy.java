package strategy;

public class DriveStrategy implements RunStrategy{
	@Override
	public void run() {
		System.out.println("Jedziemy!");
	}
}
