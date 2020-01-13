package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ContactDetails;
import com.Customer;

import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
	
	@Bean
	//@Scope(value="prototype")
	public Customer getCustomer() {
		return new Customer();
	}

	@Bean
	public ContactDetails getContactDetails() {
		return new ContactDetails();
	}
}
