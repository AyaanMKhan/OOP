package Intro;
public class printPyramid {
    public static void main(String[] args) {
        printPyra(5);
    }


    public static void printPyra(int lineNum){
        for(int i = 1; i <= lineNum; i++){
            printLine(i);
            System.out.println();
        }
    }

    public static void printLine(int Star){
        for(int i = 0; i < Star*2-1; i++){
            System.out.print("*");
            
        }
    }
}