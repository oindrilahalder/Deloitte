package com.cms.deloitte.dao;

import java.util.List;

import com.cms.deloitte.model.Customer;

public interface CustomerDAO {

	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
    public List<Customer>listCustomers();
    public Customer findCustomer(int customerId);
	public boolean isCustomerExists(int customerId);
public List<String> filterCustomer(int billAmount);
public List<Customer> filterCustomer(String customerAddress,int billAmount);

}
