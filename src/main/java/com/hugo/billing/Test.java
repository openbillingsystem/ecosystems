package com.hugo.billing;

import javax.naming.NamingException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	/*@Autowired
	private ReadService readService;
	
	public Test(ReadService readService){
		this.readService=readService;
	}
	*/
	@SuppressWarnings("resource")
	public static void main(String[] args) throws NamingException {
	   
		 
		
		new ClassPathXmlApplicationContext("beans.xml");
	
		
		
	}

	
}
 