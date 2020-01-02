package collectiondemo;

import java.util.Map;
import java.util.TreeMap;

public class MapDEmo {

	public static void main(String[] args) {
		Map<Integer,String> allData = new TreeMap<Integer,String>();
		
		allData.put(1098, "kalpana"); //no add fn here
		allData.put(12, "neha"); //(key,value)key cant be duplicate
		allData.put(10981, "jay");
		
		System.out.println(allData.get(12));
		System.out.println(allData);
	}

}
