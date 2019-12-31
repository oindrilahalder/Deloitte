package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		Set names = new HashSet(); //HashSet(no order) LinkedHashSet(in given way)
		names.add("Jay");
		names.add("veeru");
		names.add("Neha");
		names.add("Spring"); //sets dont accept duplicate
		
		names.remove("Neha");
		System.out.println(names);

	}

}
