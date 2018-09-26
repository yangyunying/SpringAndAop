package com.spring.aop01.XmlImplAop;

import static org.junit.Assert.*;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.aop01.staticProxy.IMath;

/**
 * Created by admin on 2018/9/26.
 */
public class AdvicesTest {

    @org.junit.Test
    public void test03()
    {
        //容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beansOfAOP.xml");
        //从代理工厂中获得代理对象
        IMath math=(IMath)ctx.getBean("math");
        int n1=75,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
