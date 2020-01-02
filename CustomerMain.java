package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(101,"jaya","pune",98000);
		
		allCustomers.add(customer1);
		allCustomers.add(new Customer(102,"pooja","delhi",65000));//anonymous obj creation
		allCustomers.add(new Customer(103,"tarun","mumbai",1000));
		allCustomers.add(new Customer(104,"harish","jaipur",2000));
		allCustomers.add(new Customer(105,"ahmed","bagalore",20000));
		
		System.out.println("befor sorting");
		System.out.println(allCustomers); //will print in one line
	
		System.out.println("sort on 1)Name 2)address 3)bill amount");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		//sorting by 3 types
		if(choice == 3) { //creating compareto in cust class
			Collections.sort(allCustomers);
			System.out.println("after sorting on bill amount");
			System.out.println(allCustomers);
		}
		
		if(choice == 2) { //creating anonymous class
			Collections.sort(allCustomers, new Comparator<Customer>(){
				
				@Override
				public int compare(Customer o1, Customer o2) {
					if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress()) > 0)
						return 0;
					else
						return -1;
				}
			});
			System.out.println("after sorting on address");
			System.out.println(allCustomers);
		}
		
		if(choice == 1) { //creating new class
			Collections.sort(allCustomers, new NameComparator());
			System.out.println("after sorting on name");
			System.out.println(allCustomers);
		}
		/*Iterator<Customer> i1= allCustomers.iterator(); //prints in diff line 
		
		while(i1.hasNext()) {
			Customer customer = i1.next(); //can access one by one
			System.out.println(customer);
		}
		
		System.out.println("after sorting on bill amount");
		
		//sorting
		Collections.sort(allCustomers);
		
		//after sorting on bill amount
		Iterator<Customer> i2= allCustomers.iterator(); //prints in diff line 
		
		while(i2.hasNext()) {
			Customer customer = i2.next(); //can access one by one
			System.out.println(customer);
		}*/
	}
}
