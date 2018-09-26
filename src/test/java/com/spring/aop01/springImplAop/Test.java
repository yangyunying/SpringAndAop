package com.spring.aop01.springImplAop;

import static org.junit.Assert.*;
import org.springframework.aop.framework.ProxyFactory;
import com.spring.aop01.staticProxy.IMath;
import com.spring.aop01.staticProxy.Math;

/**
 * Created by admin on 2018/9/26.
 * 若要代理不同的对象需要反复创建ProxyFactory对象，代码会冗余
 * ---->封装代理创建逻辑TimeSpanAdvice和封装动态代理类SpringDynamicProxy
 */
public class Test {
    @org.junit.Test
    public void test01()
    {
        //实例化Spring代理工厂
        ProxyFactory factory=new ProxyFactory();
        //设置被代理的对象
        factory.setTarget(new Math());
        //添加通知，横切逻辑
        factory.addAdvice(new BeforeAdvice());
        factory.addAdvice(new AfterAdvice());
        factory.addAdvice(new SurroundAdvice());
        //从代理工厂中获得代理对象
        IMath math=(IMath) factory.getProxy();
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }


    //封装代理创建逻辑TimeSpanAdvice和封装动态代理类SpringDynamicProxy
    @org.junit.Test
    public void test02()
    {
        //从代理工厂中获得代理对象
        IMath math=(IMath) SpringDynamicProxy.getProxy(new Math());
        int n1=200,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
