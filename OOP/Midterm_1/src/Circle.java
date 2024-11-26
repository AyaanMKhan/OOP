


public class Circle {
	
	private double radius;
	private static int InstanceCounter;
	
	public Circle(double radius) {
		this.radius = radius;
		InstanceCounter++;
	}
	
	public Circle() {
		radius = 1.0;
		InstanceCounter++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public static int getInstanceCounter() {
		return InstanceCounter;
	}
	
	public String toString() {
		return "The radius is: " + radius;
	}
	
	public static void main(String[] args) {
		
		Circle circ1 = new Circle(3.0);
		Circle circ2 = new Circle(4.5);
		
		System.out.println(circ1.toString());
		System.out.println(circ2.toString());
		
		System.out.println();
		
		System.out.println(circ1.area());
		System.out.println(circ2.area());
		
		System.out.println(Circle.InstanceCounter);
		
		
	}
	
	
}
