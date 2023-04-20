package com.sj.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //生成对象，设置配置的属性

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld1");
        System.out.println(helloWorld);
        System.out.println("--------------------------------");
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);
    }
}
