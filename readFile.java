import java.util.*;
import java.io.File;

public class readFile {

	public static void main(String[] args){
		readFile();
	}
	
	public static void readFile(){
		int number;
		ArrayList<Integer> list = new ArrayList<>();	//works?

		String fileName = "fileToRead.txt";
		File file = new File(fileName);
		Scanner sc;

		try{
			sc = new Scanner(file);

			while(sc.hasNext()){ 
				list.add(sc.nextInt());
			}
		}catch(Exception e){
			System.out.println("error: " + e.getMessage());
		}

		System.out.println(list.size());	//test
	}
}