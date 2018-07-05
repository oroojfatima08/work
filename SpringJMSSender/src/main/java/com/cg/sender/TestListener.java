package com.cg.sender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListener {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jmscontext.xml");
		
		 /*  GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();  
		    ctx.load("classpath:jmscontext.xml");  
		    ctx.refresh();  
		*/
		
		  MySender sender=ctx.getBean("messageSender",MySender.class);  
		    sender.sendMessage("hello jms.....!!!How u doing");
		

	}

}
