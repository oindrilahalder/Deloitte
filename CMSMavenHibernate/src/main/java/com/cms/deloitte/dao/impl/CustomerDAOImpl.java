package com.cms.deloitte.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cms.deloitte.dao.CustomerDAO;

import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	Configuration configuration= null; //hibernate.cfg.xml
	SessionFactory factory= null;
	 
	public CustomerDAOImpl() {
		configuration= new Configuration().configure();
		factory= configuration.buildSessionFactory();
	}
	@Override
	public boolean addCustomer(Customer customer) {
		
		Session session=factory.openSession();
	    Transaction transaction= session.beginTransaction();
	    
		session.save(customer);
		transaction.commit();
		session.close();
				
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session=factory.openSession();
		Transaction transaction= session.beginTransaction();
		
		
		session.update(customer);
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Session session=factory.openSession();
		Transaction transaction= session.beginTransaction();
		Customer customer= new Customer();
		customer.setCustomerId(customerId);
		
		session.delete(customer);
		transaction.commit();
		session.close();
				
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from Customer"); //we don't give table name in customer420
		List<Customer> allCustomers=query.list();
		return query.list();
	}

	@Override
	public Customer findCustomer(int customerId) {
		Session session=factory.openSession(); //fetching (for fetching we don't need transaction)
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();

		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session=factory.openSession(); //fetching (for fetching we don't need transaction)
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();

		if (customer==null)
		return false;
		else
		return true;
		}
	}

