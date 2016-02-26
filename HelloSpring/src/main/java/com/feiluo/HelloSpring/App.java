package com.feiluo.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	     HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	     System.out.println("Your Message : " + obj.getMessage());
    }
}
