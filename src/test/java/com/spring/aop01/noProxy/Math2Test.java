package com.spring.aop01.noProxy;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/9/26.
 */
public class Math2Test {
    @org.junit.Test
    public void test01()
    {
        Math2 math=new Math2();
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
