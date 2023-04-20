package com.sj.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        ArithmeticCalculator arithmeticCalculatorImp = (ArithmeticCalculator) context.getBean("arithmeticCalculator");
        arithmeticCalculatorImp.add(1,2);

    }
}
