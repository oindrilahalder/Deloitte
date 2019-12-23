package demo;

import java.util.Scanner;

public class LeapYear {
public static void check(int year) {
	if ((year%4==0 && year%400==0 && year%100==0) ||(year%4==0 && year%100!=0))
		System.out.println("It is a leap year");
else 
	System.out.println("IT is not a LEAP YEAR");
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a year");
			int year=scanner.nextInt();
					LeapYear leap= new LeapYear();
			LeapYear.check(year);
}
}
