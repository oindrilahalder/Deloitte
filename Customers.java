package iodemos;

import java.io.Serializable;
import java.util.Scanner;

public class Customers implements Serializable,Comparable<Customers>{	//plain old java object class(pojo)
	private int customerId;
	private String customerName;
	private String customerAddress;
	private transient int billAmount;//wont allow serialization
	
	public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
        System.out.println("Enter customer name : "); customerName = scanner.next();
        System.out.println("Enter customer address : "); customerAddress = scanner.next();
        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
    }
	
	public Customers(){
		
	}
	
	public Customers(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "\n Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Customers o) {
		if(this.getBillAmount() > o.getBillAmount())
			return 0;		//ascending order (if return -1 is first descending order)
		else
			return -1;
	}
}
	
