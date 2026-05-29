package com.firstSpring.jai;

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
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        data obj = context.getBean("dataBean", data.class);
//        obj.compile();
//        Laptop obj1 = context.getBean("lapBean", Laptop.class);
//        obj1.coding();
    }
}
