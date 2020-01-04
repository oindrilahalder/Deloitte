package Postassessment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Employees:");
		int n = sc.nextInt();
		EmployeeBo b = new EmployeeBo();
		EmployeeVo[] employee = new EmployeeVo[n];
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Enter Employee ID, NAME, INCOME ");
			employee[i] = new EmployeeVo(sc.nextLong(), sc.next(), sc.nextDouble(), 0);
		}
		sc.close();
		for (EmployeeVo p : employee) {
			b.calincomeTax(p);
			System.out.println(p);
		}
		
		
		List<EmployeeVo> list = Arrays.asList(employee);
		Collections.sort(list, new Employeesort());

		System.out.println("===Sorted Array===");
		System.out.println(list);
	}

}
