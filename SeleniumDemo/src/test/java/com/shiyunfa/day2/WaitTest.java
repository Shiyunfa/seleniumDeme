package com.shiyunfa.day2;

import com.shiyunfa.day1.Tool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {
    /**
     * 等待的几种方法
     */
    Tool tool = new Tool();
    WebDriver driver = tool.getDriver();
    WebElement element;


    @BeforeMethod
    public void before(){
        //webdriver中执行所有的findelement如果没有找到都会等待5秒        全局等待（隐式等待）
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //显示等待 明确的等待10秒钟找到这个元素，规定时间没有找到就报错
        WebDriverWait wait =new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
    }


    @Test
    public void waitTest(){

    }



    @AfterMethod
    public void close(){
        tool.close();
    }
}
