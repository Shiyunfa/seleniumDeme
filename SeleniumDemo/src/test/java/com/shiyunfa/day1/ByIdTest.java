package com.shiyunfa.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 八种定位到元素的方式
 */

public class ByIdTest {
    Tool tool = new Tool();
    WebDriver driver;

    @BeforeMethod
    public void openDriver(){
        driver = tool.getDriver();
    }

    /**
     * 打开百度首页
     * 使用by.id查找元素
     */
    @Test
    public void byIdTest(){
        WebElement element=null;
        //通过by.id查找元素
        //element = driver.findElement(By.id("kw"));

        //通过by.name查找元素
        //element = driver.findElement(By.name("wd"));

        //通过by.className查找
        //element = driver.findElement(By.className("quickdelete"));

        //通过Linktest查找元素            只适用于a标签  span和其他的标签不适用
        //element = driver.findElement(By.linkText("高考加油"));

        //通过partialLinkTest查找      查找部分文本，  只适用于a标签
        element = driver.findElement(By.partialLinkText("加油"));
        System.out.println(element.getText());

        //通过xpath查询
        //List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"s-top-left\"]/a"));
        //System.out.println(list.size());

        //通过cssSelector查询
        //element = driver.findElement((By.cssSelector("#s_tab > div > a.s-tab-item.s-tab-zhidao")));



    }
    /**
     * 用findElement查询一个数组，他只会查找到第一个元素
     */

    /**
     * 关闭窗口
     */
    @AfterMethod
    public void closeDriver(){
        tool.close();
    }
}
