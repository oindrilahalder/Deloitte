package oops;

import java.util.Scanner;

public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;
	Scanner scanner=new Scanner(System.in);
	public void takeSalary()
	{
		System.out.println("enter employee id");
		employeeId=scanner.nextInt();
		System.out.println("enter employee name");
		employeeName= scanner.next();
		System.out.println("enter employee Address");
		employeeAddress= scanner.next();
		System.out.println("enter employee Salary");
		salary = scanner.nextInt();
	}
	public void printEmployeeDetails() {
		System.out.println("employee Id:" +employeeId);
		System.out.println("employee Name:" +employeeName);
		System.out.println("employee IAddress:" +employeeAddress);
		System.out.println("salary:" +salary);
	}

}
