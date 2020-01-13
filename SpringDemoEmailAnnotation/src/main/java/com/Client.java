package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;

public class Client 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Email mail = context.getBean(Email.class);
    	To to = context.getBean(To.class);
    	From from = context.getBean(From.class);
    	Subject subject = context.getBean(Subject.class);
    	Body body = context.getBean(Body.class);
    	
    	to.setToName("oindrila");
    	to.setToEmail("oindrila@gmail.com");
    	
    	from.setFromName("samriddhi");
    	from.setFromEmail("samriddhi@gmail.com");
    	
    	subject.setCaption("say hello");
    	
    	body.setMessage("hello");
    	
        System.out.println(mail);
       
    }
}
