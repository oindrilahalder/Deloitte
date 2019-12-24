package oops;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private  int billamount=1000;
	
	public Customer() {
		customerId=1001;
		customerName="NA";
		customerAddress="NA";
		billamount=500;
		System.out.println("Customer constructor called");
	}
	public Customer(int customerId, String customerName, String customerAddress, int billamount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billamount = billamount;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBillamount() {
		return billamount;
	}
	public void setBillamount(int billamount) {
		this.billamount = billamount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void payBill() {
		System.out.println("Customer payBill called");
		
	}
	public void printCustomerDetails() {
System.out.println("customer Id:"+ customerId);
System.out.println("customer Name:"+ customerName);
System.out.println("customer Address:"+ customerAddress);
System.out.println("customer Bill Amount:"+ billamount);
}
	
	}	
	
	
