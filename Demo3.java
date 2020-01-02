package collectiondemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>(); //HashSet(no order) LinkedHashSet(in given way)
		names.add("Jay");
		names.add("veeru");
		names.add("Neha");
		names.add("Spring"); //sets dont accept duplicate
		//names.add(100); //might break the code at runtime 
						//if <>is written it wont allow integer input
		//names.add(true);
		
		System.out.println(names); //prints in one line
		Iterator<String> i=names.iterator(); //prints in diff line 
		
		while(i.hasNext()) {
			String str = i.next(); //can access one by one
			if(str.equals("Neha"))
				continue;
			System.out.println(str);
		}
	}

}
