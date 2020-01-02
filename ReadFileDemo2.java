package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File file =new File("mohan.txt");//if location is not given(creates in prgm folder itself)
		FileInputStream reader = new FileInputStream(file);
		//System.out.println(reader.read());//returns ascii value of 1st character
		//System.out.println((char) reader.read()); //reads one character at a time
		int i=0;
		
		while ((i = reader.read()) !=-1) {
			System.out.print((char)i); //reads the whole file
		}
		reader.close();
	}
}
