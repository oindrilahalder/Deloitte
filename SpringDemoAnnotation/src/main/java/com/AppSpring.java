package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfig;

public class AppSpring 
{
    public static void main( String[] args )
    {
    	//Resource resource= new ClassPathResource("beans.xml");
    	AbstractApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	//BeanFactory factory= new XmlBeanFactory(resource);
	Customer customer=context.getBean(Customer.class);
	
	customer.setCustomerId(1990);
	customer.setCustomerName("Jaya");
	customer.setCustomerAddress("Pune");
	customer.setBillAmount(9800);
	
		
		 // Customer customer= (Customer)factory.getBean("cust");
		 ContactDetails contactdetails=context.getBean(ContactDetails.class);
		 contactdetails.setMobileNumber("91717");
		 contactdetails.setEmailId("jaya@gmail.com");
    	
    //	customer.setCustomerName("Oindrila");
    	System.out.println(customer);
    	//System.out.println(contactdetails);
    	Customer customer1=context.getBean(Customer.class);

    	context.registerShutdownHook();
       
    }
}
