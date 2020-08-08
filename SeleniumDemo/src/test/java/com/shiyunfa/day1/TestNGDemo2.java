package com.shiyunfa.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {

    /**
     * Assert检测方法
     */

    @Test
    public void assertEqualTest(){
        String a = "ab";
        String b = "abc";
        //第一个参数是实际值，第二个参数是预期值，如果实际值不是与气质就报错
        Assert.assertEquals(a,b,"a跟b不一样" );
        //只要抛出错误，这个case后面的代码都不执行
        //case要保持原子性
        //assert后面不要做别校验了，不会执行
    }
    @Test
    public void assertNotEqualTest(){
        int a =1;
        int b =1;
        //如果两个值相等就报错
        Assert.assertNotEquals(a,b,"结果居然是一样的");
    }

    @Test
    public void assertNullTest(){
        String i = null;
        String b = "i";
        //判断参数值是否为null,不是则报错
        Assert.assertNull(b,"参数值不是为null");
    }

    @Test
    public void assertNotNullTest(){
        String i = null;
        String b = "i";
        //判断参数值是否为不是null,是则报错
        Assert.assertNotNull(i);
    }


}
