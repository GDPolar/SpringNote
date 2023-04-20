package com.sj.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object person3 = context.getBean("person3");
        System.out.println(person3);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    

    }
}
