package carEx;

public class Vehicle {
	private int wheelNumber;
	
	public Vehicle() {
		wheelNumber = 4;
		System.out.println("Vechile is created");
	}
	
	public int getWheelNumber() {
		return wheelNumber;
	}
	
	public Vehicle getSelf() {
		return this;
	}
	
	public void go() {
		System.out.println("I crashed");
	}
	
	
}
