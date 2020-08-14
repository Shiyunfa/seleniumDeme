package com.shiyunfa.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomjsTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("phantomjs.binary.path","F:\\IdeaProjec\\SeleniumDemo\\drivers\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("知乎");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

}
