
import java.util.*;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		
		initialize(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
	}
	
	
	public static void initialize(int[][]arr) {
		
		for(int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i],  -1);
		}
		
	}
	
}
