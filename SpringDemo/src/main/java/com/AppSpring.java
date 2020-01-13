package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpring 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * Resource resource= new ClassPathResource("beans.xml"); BeanFactory factory=
		 * new XmlBeanFactory(resource);
		 */
	//Customer customer= (Customer)factory.getBean("cust"); 
		
		  Customer customer1= (Customer)context.getBean("cust");
		  Customer customer2= (Customer)context.getBean("cust");
		 
    	
    //	customer.setCustomerName("Oindrila");
    	System.out.println(customer1);
    	System.out.println(customer2);
        
    	context.registerShutdownHook();
       
    }
}
