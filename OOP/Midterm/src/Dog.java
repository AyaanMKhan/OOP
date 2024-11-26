
public class Dog {
	
	private String name;
	private String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog("Ayaan", "German Shepard");
		Dog dog2 = new Dog("Stan", "Pitbull");
		
		System.out.println(dog1.name + " " + dog1.breed);
		
		System.out.println(dog2.name + " " + dog2.breed);
		
		dog1.setBreed("NAZI");
		dog2.setName("TUPAC");
		
		System.out.println(dog1.name + " " + dog1.breed);
		
		System.out.println(dog2.name + " " + dog2.breed);
	}
	
	
}
