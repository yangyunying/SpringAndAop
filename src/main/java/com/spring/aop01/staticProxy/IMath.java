package com.spring.aop01.staticProxy;

/**
 * Created by admin on 2018/9/26.
 * 静态代理  定义抽象主题接口
 */
public interface IMath {
    //加
    int add(int n1, int n2);

    //减
    int sub(int n1, int n2);

    //乘
    int mut(int n1, int n2);

    //除
    int div(int n1, int n2);
}
