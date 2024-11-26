package Intro;
public class index {
    public static void main(String[] args) {
        String name = "This is a string";
        int pos = name.indexOf("g");
        int pos1 = name.indexOf("is");
        int pos2 = name.lastIndexOf("is");
        boolean containsBoolean = name.contains("tri");
        System.out.println("Position of g " + pos);
        System.out.println("first position of is, " + pos1);
        System.out.println("Last position of is, " + pos2);
        System.out.println("Does name contain tri? " + containsBoolean);
    }
}
