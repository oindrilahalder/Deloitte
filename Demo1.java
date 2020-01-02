package iodemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\deloitte\\newyear.txt");//points to the file
		File h = new File("e:\\deloitte\\K"); 
		
		if(file.exists()) {
			System.out.println("file is there");
			file.delete();
		}
		else {
			h.mkdir();//creates folder
			file.createNewFile();
			System.out.println("file created");
		}
		System.out.println("done");
	}
}
