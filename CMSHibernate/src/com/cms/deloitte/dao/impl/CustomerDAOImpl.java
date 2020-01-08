package com.cms.deloitte.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.Session;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	
	Configuration configuration=null;  //hibernate.cfg.xml
	SessionFactory factory=null;

	public CustomerDAOImpl() {
		configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
	}
	
	@Override
	public boolean addCustomer(Customer customer) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();//int cant be sent to delete function
		customer.setCustomerId(customerId);//therefore obj creation
		session.delete(customer);
		
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		Session session = factory.openSession();
		Query query= session.createQuery("from Customer");
		List<Customer> allCustomers = query.list();
		session.close();
		return allCustomers;
	}

	@Override
	public Customer findCustomer(int customerId) {
		Session session = factory.openSession();
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();
		
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session = factory.openSession();
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();
		
		if(customer == null)
			return false;
		else
			return true;
	}

	
}
