package com.sj.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//注解切面Aspect
@Aspect
@Component
@Order(1) //设置Aspect优先级，数字越小越高

public class LoggingAspect {

    //声明切入点表达式，该方法一般为空方法体
    @Pointcut("execution(public int com.sj.spring.aop.ArithmeticCalculatorImp.add(int ,int ))")
    public void pointCutDeclare(){}

//    //指定方法前执行
//    @Before("execution(public int com.sj.spring.aop.ArithmeticCalculatorImp.add(int ,int ))")
//    public void beforeMethod(JoinPoint joinPoint) {
//        //JoinPoint对象封装了SpringAop中切面方法的信息
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        System.out.println(joinPoint.getSignature().getName());
//        System.out.println("beforeMethod.....");
//    }
//
//    //后置执行，无论是否出现异常
//    @After("execution(public int com.sj.spring.aop.ArithmeticCalculatorImp.add(int ,int ))")
//    public void afterMethod(JoinPoint joinPoint) {
//        System.out.println("afterMethod.....");
//    }
//
//    //正常结束执行，可以访问返回值
//    @AfterReturning(value = "execution(public int com.sj.spring.aop.ArithmeticCalculatorImp.add(int ,int ))"
//            , returning = "result")
//    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
//        System.out.println("afterReturningMethod..... returning is " + result);
//    }
//
//    //异常结束执行，可以指定异常种类时执行代码
//    @AfterThrowing(value = "execution(public int com.sj.spring.aop.ArithmeticCalculatorImp.add(int ,int ))"
//            , throwing = "ex")
//    public void afterReturningMethod(JoinPoint joinPoint, ArithmeticException ex) {
//        System.out.println("afterReturningMethod..... occurs with " + ex);
//    }

    //类似于动态代理全过程，因此必须有返回值
    @Around("pointCutDeclare()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String info = proceedingJoinPoint.getSignature().getName()
                + Arrays.toString(proceedingJoinPoint.getArgs());
        try {
            System.out.println("Before: " + info);
            result = proceedingJoinPoint.proceed();
            System.out.println("AfterRe turning " + info);
        } catch (Throwable throwable) {
            System.out.println("AfterThrowing" + info);
        }
        System.out.println("After " + info);
        return result;
    }
}
