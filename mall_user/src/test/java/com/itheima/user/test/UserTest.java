package com.itheima.user.test;

import org.junit.Assert;
import org.junit.Test;
public class UserTest {

    @Test
    public void testCase1(){
        String name = "zhangsan";
        Assert.assertEquals("zhangsan", name);
    }

    @Test
    public void testCase2(){
        String address = "beijing";
        Assert.assertEquals("beijing", address );
    }

    @Test
    public void testCase3(){
        int age = 20;
        Assert.assertEquals(20, age);
    }

    @Test
    public void testCase4(){
        int age = 20;
        Assert.assertEquals(20, age);
    }

}
