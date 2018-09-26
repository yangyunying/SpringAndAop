package com.spring.aop01.noProxy;

import java.util.Random;

/**
 * Created by admin on 2018/9/26.
 * 需求发生了变化，要求项目中所有的类在执行方法时输出执行耗时
 */
public class Math2 {
    //加
    public int add(int n1,int n2){
        //开始时间
        long start=System.currentTimeMillis();
        lazy();
        int result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        Long span= System.currentTimeMillis()-start;
        System.out.println("共用时："+span);
        return result;
    }

    //减
    public int sub(int n1,int n2){
        //开始时间
        long start=System.currentTimeMillis();
        lazy();
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
        Long span= System.currentTimeMillis()-start;
        System.out.println("共用时："+span);
        return result;
    }

    //乘
    public int mut(int n1,int n2){
        //开始时间
        long start=System.currentTimeMillis();
        lazy();
        int result=n1*n2;
        System.out.println(n1+"X"+n2+"="+result);
        Long span= System.currentTimeMillis()-start;
        System.out.println("共用时："+span);
        return result;
    }

    //除
    public int div(int n1,int n2){
        //开始时间
        long start=System.currentTimeMillis();
        lazy();
        int result=n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        Long span= System.currentTimeMillis()-start;
        System.out.println("共用时："+span);
        return result;
    }

    //模拟延时
    public void lazy()
    {
        try {
            int n=(int)new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
