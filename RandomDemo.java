package iodemos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("friday.txt","rw");
		
		file.writeUTF("today is friday");//cursor at the end of statement
		file.seek(0);//take cursor back to the start to read the file
		//String str = file.readUTF(); // readLine can be used to read from any position
		
		long a=file.length();
		file.seek(a);
		file.writeUTF("samriddhi shanker");
		file.seek(a);
		String str = file.readUTF(); 
		
		
		file.seek(0);
		String str1 = file.readLine();//readLine is used to read the file from starting
		
		file.close();
		
		System.out.println("file content is :");
		System.out.println(str);
		System.out.println(str1);

	}

}
