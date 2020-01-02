package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file to copy");
		String readFile= scanner.next();
		
		File filetoread = new File(readFile);
		if(filetoread.exists()) 
		{
			System.out.println("Enter the file to paste");
			String writeFile = scanner.next();
			
			File filetowrite = new File(writeFile);
			
			FileReader reader=new FileReader(filetoread);
			FileWriter fw=new FileWriter(filetowrite);
			int i=0;
			while((i=reader.read())!=-1)
			{
				fw.write((char)i);
			}
			
			fw.close();
			reader.close();
			System.out.println("\""+readFile+"\""+"successfully copied to"+"\""+writeFile+"\"");
		}
		else {
			System.out.println("\""+readFile+"\""+" file not found");
		}
	}
}
