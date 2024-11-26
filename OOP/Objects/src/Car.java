


public class Car {
	
	public String make;
	public String model;
	public String year;
	public String color;
	public int currentFuelAmount;
	public int milesPerGallon;

	
	public static int numTires = 4;
	
	Tire tire1;
	Tire tire2;
	Tire tire3;
	Tire tire4;
	
	public int tirePressure1 = 33;
	public int tirePressure2 = 33;
	public int tirePressure3 = 32;
	public int tirePressure4 = 34;
	
	public static int maxTirePressure1 = 35;
	public static int maxTirePressure2 = 35;
	public static int maxTirePressure3 = 35;
	public static int maxTirePressure4 = 35;
	
	
	public static void main(String[] args) {
		Car defaultCar = new Car();
		
		defaultCar.tire1.currentAirPressure = -33;
		defaultCar.tire2.currentAirPressure = 50000;
	}
	
	public Car() {
		tire1 = new Tire(35);
		tire2 = new Tire(35);
		tire3 = new Tire(35);
		tire4 = new Tire(35);
	}
	
	public void setTirePressure1(int newPressure) {
		tirePressure1 = newPressure;
	}
	
	public void setTirePressure2(int newPressure) {
		tirePressure2 = newPressure;
	}
	
	public void setTirePressure3(int newPressure) {
		tirePressure3 = newPressure;
	}
	
	public void setTirePressure4(int newPressure) {
		tirePressure4 = newPressure;	
	}
	
	
}
