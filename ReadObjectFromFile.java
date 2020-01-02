package iodemos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Customers customer= new Customers();
		
		ObjectInputStream stream = 
				new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(new File("delu.txt")))); //deserialization
		
		customer=(Customers)stream.readObject();
		
		System.out.println(customer);
	}

}
