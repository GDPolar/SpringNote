package com.sj.spring.aop;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImp implements ArithmeticCalculator {
    @Override
    public int add(int a, int b) {
        System.out.println(a + "," + b);
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int dev(int a, int b) {
        return a / b;
    }
}
