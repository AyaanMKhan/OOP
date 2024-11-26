package fileReadEx;
import java.io.*;
import java.util.ArrayList;

public class fileReaderLibrary {
	
	
	
	public static void writeFile(String fnamed, ArrayList<String> arr ) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fnamed));
			
		}
	}
	
	public static ArrayList<String> readFile(String fname){
		ArrayList<String> arr = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(fname)));
			String line ="";
			while((line=br.readLine()) != null) {
				System.out.println(line);
				arr.add(line);
			}
			br.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = readFile("test.txt");
		writeFile("textCopy.txt", arr);
		
	}
	
}
