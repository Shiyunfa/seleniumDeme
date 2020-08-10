package com.shiyunfa.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 工具类
 * 获取chrome驱动位置
 * 设置要测试的url
 * 关闭窗口
 */
public class Tool {
    String a = "webdriver.chrome.driver";
    String b = "F:\\IdeaProjec\\SeleniumDemo\\drivers\\chromedriver.exe";
    WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty(a,b);
        driver = new ChromeDriver();
        driver.get("https://www.w3school.com.cn/tiy/t.asp?f=html_select");
        return driver;
    }

    /**
     * 关闭窗口
     */
    public void close(){
        driver.quit();
    }
}
