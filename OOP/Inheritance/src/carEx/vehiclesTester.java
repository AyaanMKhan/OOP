package carEx;

public class vehiclesTester {
	public static void main(String[] args) {
		Car myCar = new Car("Ford");
		Vehicle veh = new Vehicle();
		veh.go();
		myCar.go();
		System.out.println(myCar.getWheelNumber());
	}
}
