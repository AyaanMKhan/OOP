package Intro;
import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x5 = scan.next();

        // gets everything until user presses Space

        System.out.println(x5);
        //scan.nextLine();

        String givenLine = scan.nextLine();
        // gets everything until user presses Enter

        System.out.println(givenLine);

        int givenInt = scan.nextInt();
        // reads integer else gives error

        System.out.println(givenInt);

        double givenDouble = scan.nextDouble();
        // reads double else gives error
        System.out.println(givenDouble);

        scan.close();
    }
}
