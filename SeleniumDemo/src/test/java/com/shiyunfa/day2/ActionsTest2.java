package com.shiyunfa.day2;

import com.shiyunfa.day1.Tool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 *鼠标操作的一些方法
 * actions 不传参数的话在鼠标的当前位置执行
 */
public class ActionsTest2 {
    Tool tool =new Tool();
    WebDriver driver = tool.getDriver();
    WebElement element;





    @Test
    public  void rightClickTest() throws InterruptedException {
        element = driver.findElement(By.id("su"));

        Actions actions = new Actions(driver);
        //在百度页面右键点击（传入要右键的元素）
        //actions.contextClick(element).perform();
        WebElement text = driver.findElement(By.id("kw"));
        text.sendKeys("知乎");
        Thread.sleep(2000);
        //双击元素
        actions.doubleClick(element).perform();
        Thread.sleep(2000);
        //鼠标移动到某个元素
        actions.moveToElement(text).perform();
        //拖动元素  要拖动的元素，位置，位置
        actions.dragAndDropBy(element,500,500).perform();
        //拖动元素至某个元素     选中元素        移动元素    取消选中元素      执行
        actions.clickAndHold(text).moveToElement(text).release(text).perform();

    }



    @AfterMethod
    public  void  close(){
        tool.close();
    }
}
