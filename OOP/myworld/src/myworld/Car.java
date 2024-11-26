package OOP.myworld.src.myworld;

public class Car {
	String brand;
	int year;
	boolean isRunning;
	
	
	public Car(String theBrand, int theYear) {
		brand = theBrand;
		year = theYear;
		isRunning = false;
	}
	
	public Car() {
		brand = "Toyota";
		year = 1980;
		isRunning = false;
	}
	
	public Car(boolean runState) {
		brand = "Toyota";
		year = 1980;
		isRunning = false;
	}
	

}
