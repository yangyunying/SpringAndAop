package com.spring.aop01.XmlImplAop;

import org.aspectj.lang.JoinPoint;

/**
 * 通知
 */
public class Advices {
    //前置通知
    public void before(JoinPoint jp)
    {
        System.out.println("--------------------bofore--------------------");
        System.out.println("方法名："+jp.getSignature()+"，参数："+jp.getArgs().length+"，代理对象："+jp.getTarget());
    }
    //后置通知
    public void after(JoinPoint jp){
        System.out.println("--------------------after--------------------");
    }
}