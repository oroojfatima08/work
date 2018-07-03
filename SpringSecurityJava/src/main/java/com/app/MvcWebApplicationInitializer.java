package com.app;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer extends  
AbstractAnnotationConfigDispatcherServletInitializer {
	
	  @Override  
	    protected Class<?>[] getRootConfigClasses() {  
	        return new Class[] { WebSecurityConfig.class };  
	    }  
	    @Override  
	    protected Class<?>[] getServletConfigClasses() {  
	        // TODO Auto-generated method stub  
	        return null;  
	    }  
	    @Override  
	    protected String[] getServletMappings() {  
	        return new String[] { "/" };  
	    }  

	    /*Just because SecurityConfig exists, does not mean that 
		 * our Spring application knows about it. In this instance, our Spring root
		 *  application context is initialized using MvcWebApplicationInitializer 
		 */
}
