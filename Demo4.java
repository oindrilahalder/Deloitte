package collectiondemo;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		String names []= {"A","B","C","D"};
		//convert array in list
		List<String> data =Arrays.asList(names); //Arrays is a class
		System.out.println(data);
	}
}
