
public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double circumference() {
		return Math.PI * radius * 2;
	}
	
	public static void main(String[] args) {
		
		Circle circ1 = new Circle(20);
		
		System.out.println(circ1.area());
		
		System.out.println(circ1.circumference());
		
		
		
	}
}
