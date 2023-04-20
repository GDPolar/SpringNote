package com.sj.spring.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        System.out.println(context.getBean("newCar1"));
        System.out.println(context.getBean("newCar2"));
        System.out.println(context.getBean("newPerson1"));
        context.close();    //关闭IOC容器
    }
}
