package demo;

import java.util.Scanner;

public class Swap {
	public void swapNumber(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("num1="+a);
		System.out.println("num2="+b);
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter num1");
		int a=scanner.nextInt();
		System.out.println("Enter num2");
		int b=scanner.nextInt();
		scanner.close();
		Swap s1=new Swap();
		s1.swapNumber(a, b);
		
		
	}

}
