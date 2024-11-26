package bTests;

public class Wheel {
	
	private int turningTimes;
	Wheel(){turningTimes = 20;}
	
	
	public void turn() {
		System.out.println("Wheel is turning");
	}
	
	
	public int turn() {
		return turningTimes;
	}
	
	public void turn(int times) {
		System.out.println("Wheels is turning" + times + " times");
	}
	
}
