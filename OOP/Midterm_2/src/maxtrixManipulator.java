
public class maxtrixManipulator {
	
	public static int[][] replaceMultiplesOfThrees(int[][] arr){
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if((i +j ) % 3 == 0) {
					arr[i][j] = 0;
				}
			}
		}
		
		return arr;
		
	}
	
	public static double calculateArray(int[][] arr) {
		
		double sum = 0;
		double count = 0;
		
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		
		return sum/count;

	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		printArray(arr);
		
		
		
		
		int[][] new_arr = replaceMultiplesOfThrees(arr);
		
		printArray(new_arr);

		
		
		double average = calculateArray(arr);
		
		double avg = calculateArray(new_arr);
		
		System.out.println(avg);
		
		System.out.println(average);
		
		
	}
	
	
	private static void printArray(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
		
		
		
	}
	
}
