package com.sj.spring.postProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        System.out.println(context.getBean("newCar1"));
        context.close();    //关闭IOC容器
    }
}
