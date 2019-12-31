package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List names = new ArrayList(); //arraylist(itration/async faster)/stack(fifo)
									//vector(sync)/linkedlist(insertion/deletion)
		names.add("Himanshu");
		names.add("Anthony");
		names.add("swami");
		names.add("swami"); //lists accept duplicate
		
		System.out.println(names);
		names.add(2,"reddy");//add at position 2 starts from 0		
		System.out.println(names);
		names.remove("swami");
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.size());
	}

}
