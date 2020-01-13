package com;

import java.io.Serializable;
import java.util.Scanner;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer implements Serializable, InitializingBean, DisposableBean{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	@Autowired(required=false)
	private ContactDetails contactDetails;

	public Customer() {
		System.out.println("default cons called");
	}
	
	@PostConstruct
	public void dd() {
		System.out.println("## init called via annotation");
	}
	@PreDestroy
	public void dd2() {
		System.out.println("## destroy called via annotation");
	}
	
	public Customer(ContactDetails contactDetails) {
		System.out.println("contact details cons called");
		this.contactDetails = contactDetails;
	}


	public Customer(int customerId, String customerName, String customerAddress, int billAmount,
			ContactDetails contactDetails) {
		System.out.println("  5 param cons called");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		this.contactDetails = contactDetails;
	}

	
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		System.out.println("4 param cons called");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

	public void acceptCustomerDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		customerId = scanner.nextInt();
		System.out.println("Enter customer name : ");
		customerName = scanner.next();
		System.out.println("Enter customer address : ");
		customerAddress = scanner.next();
		System.out.println("Enter bill amount : ");
		billAmount = scanner.nextInt();
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

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
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
		Customer other = (Customer) obj;
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
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + ", \ncontactDetails=" + contactDetails + "]";
	}

	public void destroy() throws Exception {
		System.out.println("destroy using interface");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init using interface");

		
	}
}
