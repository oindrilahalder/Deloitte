package Postassessment2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Arithmetic []o={new Add1(), new Sub1(), new Mul1(), new Div1()};
		
		System.out.println("Enter your choice:");
		System.out.println("1) Add");
		System.out.println("2) Sub");
		System.out.println("3) MUL");
		System.out.println("4) DIV");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("Enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int res = (o[input-1]).calculate(num1, num2);
		System.out.println("result is : "+res);

	}
}
