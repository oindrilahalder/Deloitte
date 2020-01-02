package collectiondemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getCustomerName().compareTo(c2.getCustomerName()) > 0)
			return 0;
		else
			return -1;
	}
	
	

}
