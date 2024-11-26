
import java.util.Arrays;



public class Array {
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		
		initialize(arr);
		
		swap(arr, 0, 4);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void initialize(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			
			arr[i] = i + 1;
		}
		
	}
	
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
