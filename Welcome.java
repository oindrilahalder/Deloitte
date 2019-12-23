import java.util.Date;

import finance.Salary;

public class Welcome {

	public static void main(String[] args) {
		
		System.out.println("Welcome in Eclipse IDE");
		Bye bye=new Bye();
		Bye.sayBye();
		Thanks thanks=new Thanks();
		Thanks.sayThanks();
		Apple apple=new Apple();
	Apple.eatApple();
	Ball ball=new Ball();
	Ball.playBall();
	Salary salary= new Salary();
	int result=salary.calculateSalary(65000,3500);
	System.out.println(result);
	
	Date d = new Date();
	System.out.println("Current date is:" +d);
	}

}
