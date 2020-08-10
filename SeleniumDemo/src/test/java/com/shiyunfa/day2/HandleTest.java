package com.shiyunfa.day2;

import com.shiyunfa.day1.Tool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * 把控制权交给另一个windows
 */
public class HandleTest {
    Tool tool = new Tool();
    WebDriver driver = tool.getDriver();
    WebElement element;

    @Test
    public void handleTest() throws InterruptedException {
        driver.findElement(By.linkText("贴吧")).click();
        Thread.sleep(2000);
        String hand = driver.getWindowHandle();
        for (String handles : driver.getWindowHandles())
            if (handles.equals(hand))
                continue;
            else
            driver.switchTo().window(handles);

        driver.findElement(By.linkText("小说")).click();
        Thread.sleep(2000);
    }


    @AfterMethod
    public void close(){
        tool.close();
    }
}
