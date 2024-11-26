package Final;




import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.Random;

import java.util.StringTokenizer;



public class Box implements Foldable{

	

	private int width,height,length;

	

	public Box(String dimensions) {

		StringTokenizer st = new StringTokenizer(dimensions, ",");

		

		width = Integer.parseInt(st.nextToken());

		height = Integer.parseInt(st.nextToken());

		length = Integer.parseInt(st.nextToken());

	}

	

	

	public Box(int w, int h, int l) {

		width = w;

		height = h;

		length = l;

	}

	

	public Box(int side) {

		width = side;

		height = side;

		length = side;

	}

	

	public int getWidth() {

		return width;

	}

	

	public int getHeight() {

		return height;

	}

	

	public int getLength() {

		return length;

	}

	

	public void setWidth(int width) {

		this.width = width;

	}

	

	public void setHeight(int height) {

		this.height = height;

	}

	

	public void setLength(int length) {

		this.length = length;

	}

	

	@Override

	public boolean equals(Object obj) {

		// Checks if references are the same

		if (this == obj)

			return true;

		

		// Checks if dimensions are the same

		Box box1 = (Box)obj;

		return width == box1.width && height == box1.height

				&& length == box1.length;

	}

	

	@Override 

	public String toString() {

		return "Width: " + width + "Height: " + height + "Length: " + length;

	}

	

	public static boolean checkIfImportant(Box b) {

		if (b.width*b.length*b.height % 3 ==0) {

			return true;

		}

		return false;

	}

	

	public static void printArrayList(ArrayList<Box> arr) {

		for(int i=0;i<arr.size();i++) {

			Box el=arr.get(i);

			if(Box.checkIfImportant(el)) {

				System.out.println("IMPORTANT");

			}else {

				System.out.println(el);

			}

		}

	}

	

	

	

	public static void printArray(Box[] arr) {

		for(Box el:arr) {

			if(Box.checkIfImportant(el)) {

				System.out.println("IMPORTANT");

			}else {

				System.out.println(el);

			}

		}

	}

	

	@Override

	public int fold() {

		return 2 * ( width*height + height*length + length*width   );

	}

	

	public static Box randomBox() {

		Random r=new Random();

		return new Box(r.nextInt(1,10),r.nextInt(1,10),r.nextInt(1,10));

	}

	

	public static ArrayList<Box> createRandomArrayList(int num) {

		ArrayList<Box> arr=new ArrayList<>();

		for(int i=0;i<num;i++) {

			arr.add(Box.randomBox());

		}

		return arr;

	}

	

	public static Box[] createRandomArray(int num) {

		Box[] arr=new Box[num];

		for(int i=0;i<arr.length;i++) {

			arr[i]=Box.randomBox();

		}

		return arr;

	}

	

	

	public static void main(String[] args) {

		Box[] arr=new Box[5];

		arr[0]=new Box(3,3,5);

		arr[1]=new Box(9,1,6);

		arr[2]=new Box(1,5,7);

		arr[3] = new Box(5,6,7);

		arr[4] = new Box(7,9,1);

		printArray(arr);

		Arrays.sort(arr);

		printArray(arr);

		ArrayList<Box> arrList=new ArrayList<>();

		arrList.add(arr[0]);

		arrList.add(arr[1]);

		arrList.add(arr[2]);

		System.out.println(arrList);

		Collections.sort(arrList);

		System.out.println(arrList);

	}

}
