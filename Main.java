package iodemos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		Customers customer= new Customers();
		customer.accept();
		
		ObjectOutputStream stream = 
				new ObjectOutputStream(new BufferedOutputStream(
						new FileOutputStream(new File("delu.txt")))); //serialization
		stream.writeObject(customer);
		
		stream.close();
		System.out.println("data stored");
	}

}
