package com.shiyunfa.day1;

import org.testng.annotations.*;

public class TestNGDemo1 {

    /**
     * testNG常用注解
     */

    //执行类的时候，执行的方法不是安顺序执行，是按照方法名称的ascii码

    //这个类里面所有的test运行之前，都会先运行BeforeTest，只运行一次
    @BeforeTest
    public void beforeTest1(){
        System.out.print("这是beforeTest注解");
    }

    //这个类里面所有test运行之前，都会先运行一次BeforeTest，有多少个Test就运行多少次
    @BeforeMethod
    public void beforeMethodTest(){
        System.out.print("这是BeforeMethod注解");
    }

    @Test
    public void testCase1(){
        System.out.print("这是@Test注解1");
    }

    @Test
    public void testCase2(){
        System.out.print("这是@Test注解1");
    }

    //所有方法运行完之后，最后运行AfterTest1
    @AfterTest
    public void AfterTest1(){
        System.out.print("这是@AfterTest1");
    }

    //每一个Test方法运行完之后都会运行一次，有多少个Test就运行多少次
    @AfterMethod
    public void AfterMethodTest(){
        System.out.print("这是@AfterMethod");
    }
}
