package com.spring.aop01.jdkProxy;

import com.spring.aop01.staticProxy.IMath;
import com.spring.aop01.staticProxy.Math;
/**
 * Created by admin on 2018/9/26.
 */

public class DynamicJdkProxyTest {

    //实例化一个MathProxy代理对象
    //通过getProxyObject方法获得被代理后的对象
    IMath math=(IMath)new DynamicJdkProxy().getProxyObject(new Math());//Math类--被代理的类必须实现接口，未实现接口则没办法完成动态代理
    @org.junit.Test
    public void test01()
    {
        int n1=105,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
