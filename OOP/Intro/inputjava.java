package Intro;
import java.util.Scanner;

public class inputjava {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("What is the name?");

        String name = Obj.nextLine();
        System.out.println(name);

        Obj.close();
    }
}
