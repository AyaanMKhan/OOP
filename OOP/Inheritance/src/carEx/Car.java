package carEx;

public class Car extends Vehicle{
	private String brandName;
	
	public Car(String bname) {
		super();
		brandName = bname;
	}
	
	@Override
	public Car getSelf() {
		return this;
	}
	
	public void go() {
		System.out.println("Vroom Vroom ");
	}
}
