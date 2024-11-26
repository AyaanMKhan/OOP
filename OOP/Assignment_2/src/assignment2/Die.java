// Ayaan Khan
// COP 3330
// Assignment 2

package assignment2;

import java.util.Random;



public class Die {
	// Instance variable for the face value of the die
	private int faceValue;
	
	// setting the value to 1 for now
	public Die() {
		faceValue = 1;
	}

	
	// Getting the value
	public int getFaceValue() {
		return faceValue;
	}

	
	// Setting the value
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	
	// Randomly getting a value from 1 through 6 both inclusive [1,6]
	public void setRoll() {
		Random rand = new Random();
		int upper = 6;
		this.faceValue = rand.nextInt(upper) + 1;
	}
	
}
