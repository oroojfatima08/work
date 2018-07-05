package com.cg.receiver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListener {

	public static void main(String[] args) {
		ApplicationContext atx=new ClassPathXmlApplicationContext("jmscontext.xml");
	
		 /*GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();  
		    ctx.load("classpath:jmsContext.xml");  
		    ctx.refresh();  
		    */  
		  //  while(true){}  
		
		

	}

}
