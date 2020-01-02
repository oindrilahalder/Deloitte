package iodemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("record.txt");
		
		fw.write("my name is samriddhi shanker");
		fw.close();
		System.out.println("done");
	}

}
