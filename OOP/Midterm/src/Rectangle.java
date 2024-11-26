
public class Rectangle {
	
	public int width;
	public int height;
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(10, 20);
		
		double area = rect.area();
		
		System.out.println(area);
		
		double perm = rect.perimeter();
		
		System.out.println(perm);
		
	}

}
