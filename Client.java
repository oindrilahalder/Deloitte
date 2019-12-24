package oops;

public class Client {
	public static void main(String[] args) {
		
		/*Employee employee=new Employee();
		employee.takeSalary();
		employee.printEmployeeDetails();*/
		Customer customer3=new Customer(1002, "Mohan", "Pune",500);
		customer3.setBillamount(1000);
		customer3.printCustomerDetails();
		
	}

}
