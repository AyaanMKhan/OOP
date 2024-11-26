package bTests;

import java.util.ArrayList;


public class Bicycle {
	
	private ArrayList<Wheel> wheels;
	
	public Bicycle(int numWheels) {
		wheels = new ArrayList<>();
		System.out.println("Bicycle is created");
		for(int i = 0; i < numWheels; i++) {
			wheels.add(new Wheel());
		}
	}
	
	public void go() {
		for(Wheel w: wheels) {
			w.turn();
		}
		
		System.out.println("Bicycle is going");
	}

}
