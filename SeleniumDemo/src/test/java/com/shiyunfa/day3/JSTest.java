package com.shiyunfa.day3;

import com.shiyunfa.day1.Tool;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *通过js做一些事情
 */
public class JSTest {
    Tool tool = new Tool();
    WebDriver driver ;

    @BeforeMethod
    public void before(){
       driver =  tool.getDriver();
    }

    @Test
    public void test() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("var a = document.getElementById(\"kw\").setAttribute(\"value\",\"知乎\")");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void close(){
        tool.close();
    }
}
