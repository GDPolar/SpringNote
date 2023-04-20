package com.sj.spring.beansFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        System.out.println(context.getBean("car1FromFactory"));
        System.out.println(context.getBean("car2FromFactory"));
    }
}
