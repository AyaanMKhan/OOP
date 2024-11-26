// Ayaan Khan
// COP 3330
// Assignment 2

package assignment2;

public class Dice {
	//Creating 2 die objects to get 2 rolls
	private Die die1;
	private Die die2;
	
	
	public Dice() {
		this.die1 = new Die();
		this.die2 = new Die();
	}

	
	// Getting 2 different values for use for the dice
	public int getFaceValue() {
		return die1.getFaceValue() + die2.getFaceValue();
	}

	// Rolling the dice to randomly get a value
	public void roll() {
		die1.setRoll();
		die2.setRoll();
	}
	
}
