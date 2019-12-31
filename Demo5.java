package exceptiondemos;

import java.util.Scanner;

class InvalidAgeException extends Exception //RuntimeException unchecked exception 
			//if extends Exception is used it will be checked exception
{
	public InvalidAgeException(){
		
	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class NewYearParty
{
	int eligibleAge = 16;
	Scanner scanner = new Scanner(System.in);
	int age;
	
	public void enterClub() throws InvalidAgeException {
		System.out.println("please enter your age: ");
		age = scanner.nextInt();
		if(age < eligibleAge) {
			//here we want to bring exception
			throw new InvalidAgeException("under age");
		}
		else {
			System.out.println("allowed");
		}
	}
}
public class Demo5 {
	
	public static void main(String[] args){
		NewYearParty party= new NewYearParty();
		try {
			party.enterClub();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("ENJOY");
	}
}