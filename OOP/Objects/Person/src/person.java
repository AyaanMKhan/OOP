
public class person {
	
	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		person p1 = new person();
		p1.name = "Larry";
		System.out.println(p1.name);
		
		Intruder.someMethod(p1);
		
		System.out.println(p1.name);
		
		
	}
}

class Intruder {
	public static void someMethod(person p1) {
		p1.setName("HAHAAHA");
	}
}
