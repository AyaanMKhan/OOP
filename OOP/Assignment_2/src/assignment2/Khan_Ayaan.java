// Ayaan Khan
// COP 3330
// Assignment 2

package assignment2;

public class Khan_Ayaan {
	
	public static void main(String[] args) {
        Dice dice = new Dice();
        int[] occurrences = new int[11];

        // Roll the dice 1000 times and record occurrences
        for (int i = 0; i < 1000; i++) {
            dice.roll();
            int sum = dice.getFaceValue();
            occurrences[sum - 2]++;
        }

        // Displays results for sums of 2 through 12
        for (int i = 2; i <= 12; i++) {
            System.out.println("Number of " + i + "s are " + occurrences[i - 2]);
        }

        // Initial Graph display
        System.out.println("Graph");
        int maxOccurences = 150;

        // Loop to display graph data
        for (int i = maxOccurences; i >= 0; i -=25) {
            // Pads y-axis of the graph
            System.out.printf("%3d|", i);
            for (int j = 0; j < occurrences.length; j++) {
                if (occurrences[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Prints the x-axis
        System.out.print("     "); // Padding
        System.out.println("--------------------------------");
        System.out.print("     "); // Padding

        // Loop for proper spacing and alignment of x values
        for (int i = 2; i <= 12; i++) {
            System.out.print(i + (i < 9 ? "  " : " "));
        }
        System.out.println();
    }
}
