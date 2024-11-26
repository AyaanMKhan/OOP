package Intro;
import java.util.Random;



public class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int upper = 6;
        int int_random = random.nextInt(upper);
        double double_random = random.nextDouble();
        float float_random = random.nextFloat();

        System.out.println("Random die value" + (int_random+1));
        System.out.println("Random float value between 0.0 and 1.0: " + float_random);
        System.out.println("Random double value beween 0.0 and 1.0: " + double_random);
    }
}
