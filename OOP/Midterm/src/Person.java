
public class Person {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Person human = new Person("Ayaan", 19);
		
		System.out.println(human.age);
		System.out.println(human.name);
		
	}
	
}
