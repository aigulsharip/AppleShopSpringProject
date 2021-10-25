package com.example.lecture2project2.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DatabaseAspect {
    @Before("execution(public String findProductById(int))")
    public void beforeFindProductByIdMethodAdvice () {
        System.out.println("beforeFindProductByIdMethodAdvice: logging method");
    }


    @After("execution(public String checkAfterAdvice())")
    public void checkAfterAdvice () {
        System.out.println("This message will be printed after checkAroundAdvice method");
    }



}
