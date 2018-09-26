package com.spring.aop01.staticProxy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by admin on 2018/9/26.
 */

public class MathProxyTest {

    IMath math=new MathProxy();
    @org.junit.Test
    public void test01()
    {
        int n1=120,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }

}
