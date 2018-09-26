package com.spring.aop01.cglibProxy;

import org.junit.Test;
import static org.junit.Assert.*;
import com.spring.aop01.staticProxy.Math;

/**
 * Created by admin on 2018/9/26.
 */

public class DynamicProxyTest {

    //实例化一个DynamicProxy代理对象
    //通过getProxyObject方法获得被代理后的对象
    Math math=(Math)new DynamicProxy().getProxyObject(new Math());

    @org.junit.Test
    public void test01()
    {
        int n1=100,n2=6;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
