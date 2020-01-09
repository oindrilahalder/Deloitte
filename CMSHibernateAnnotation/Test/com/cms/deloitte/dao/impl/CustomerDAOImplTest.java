package com.cms.deloitte.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.model.Customer;

class CustomerDAOImplTest {
	
	CustomerDAO customerDAO;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		customerDAO = new CustomerDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCustomerDAOImpl() {
		fail("Not yet implemented");
	}

	@Test
	void testAddCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testListCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testFindCustomer() {
		Customer customer = new Customer(106,"ram","pune",6000);
		customerDAO.addCustomer(customer);
		Customer customer2 = customerDAO.findCustomer(customer.getCustomerId());
		assertEquals(customer,customer2);
	}
	
	@Test
	void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomerInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomerStringInt() {
		String customerAddress ="bangalore";
		int billAmount = 500;
		List<Customer> allCustomers = customerDAO.filterCustomer(customerAddress,billAmount);
		assertEquals(1, allCustomers.size());
	}

}
