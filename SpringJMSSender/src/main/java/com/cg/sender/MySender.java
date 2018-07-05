package com.cg.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;


@Component("messageSender")  
public class MySender{

	@Autowired  
	private JmsTemplate template;
	
	public void sendMessage(final String message){  
	    template.send(new MessageCreator(){  
	  
	        public Message createMessage(Session session) throws JMSException {  
	            return session.createTextMessage(message);  
	        }  
	    });  
	}

}
