package objectdemo;

public class Main {

	public static void main(String[] args){
		
		Customer customer = new Customer(9651,"sam","patna",75000);
		Customer customer2 = new Customer(9651,"sam","patna",75000);
		System.out.println(customer.equals(customer2));//false unless we override equals and hashcode
		System.out.println(customer==customer2);	//false
		System.out.println(customer);
		customer.setBillAmount(12000);
		System.out.println(customer);
		Customer customer1 = new Customer(9652,"OD","kota",85000);
		System.out.println(customer1);
		System.out.println(customer1.getBillAmount());
	}

}
