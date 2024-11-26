package Intro;
import java.util.Arrays;

public class array {
    
    
    
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i=1; i < arr.length; i++){
            arr[i-1] = i;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }

        int[][] twodarr = new int[4][4];
        for(int i =0 ; i < twodarr.length; i++){
            for(int j = i+1; j < twodarr.length; j++){
                System.out.println(i+ " " + j);
            }
        }
        System.out.println(Arrays.toString(arr));
        modif(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void combinations(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static void modif(int[] arr){
        arr[0] = -1;
    }
}
