package onetomany;

import java.util.Set;

public class Customer {

	private int customerId;
	private String customerName;
	
	private Set allCards;
	
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

	public void setAllCards(Set allCards) {
		this.allCards = allCards;
	}
	
	public Set getAllCards() {
		return allCards;
	}
	

	
}
