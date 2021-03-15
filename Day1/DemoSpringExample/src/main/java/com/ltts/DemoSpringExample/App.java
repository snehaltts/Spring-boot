package com.ltts.DemoSpringExample;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
    	Student s=(Student) context.getBean("stud");
    	System.out.println(s);
    	
        
    }
}
