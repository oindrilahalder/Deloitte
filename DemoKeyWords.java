package oops;

public class DemoKeyWords {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++)
		{
			System.out.println("hello");
		if(i==2)
			continue; // break will exit loop
		System.out.println("bye");
	}
		System.out.println(args[1]); //run as config
		for (String s:args) {
			System.out.println(s); //run as config
		}

	}
}
