package com.shiyunfa.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 设置窗口的方法
 */
public class CloseChromTest {

    String a = "webdriver.chrome.driver";
    String b = "F:\\IdeaProjec\\SeleniumDemo\\drivers\\chromedriver.exe";

    @Test
    public void closeChr() throws InterruptedException {

        System.setProperty(a,b);
        WebDriver webDriver = new ChromeDriver();
        //get方法指向地址
        //get方法一定会页面加载完之后在往下走
        webDriver.get("http:\\www.baidu.com");
        //thread.sleep暂停5秒  单位为毫秒
        Thread.sleep(3000);
        //后退一个窗口
        webDriver.navigate().back();
        Thread.sleep(3000);
        //前进一个窗口
        webDriver.navigate().forward();
        Thread.sleep(3000);
        //刷新窗口
        webDriver.navigate().refresh();
        Thread.sleep(3000);
        //关闭当前窗口
        //webDriver.close();
        //完全退出浏览器
        webDriver.quit();
    }

    /**
     * 打开浏览器
     * 设置窗口大小500*500
     * 等待3s
     * 窗口最大化
     * 等待3s
     * 关闭窗口
     */
    @Test
    public void winTest() throws InterruptedException {
        System.setProperty(a,b);
        WebDriver webDriver = new ChromeDriver();
        //dimension 尺寸
        Dimension dimension = new Dimension(200,200);
        //manage管理  window 窗口  setSize设置大小
        webDriver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        webDriver.quit();
    }
}
