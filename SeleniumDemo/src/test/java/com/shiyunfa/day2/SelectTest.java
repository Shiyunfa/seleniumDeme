package com.shiyunfa.day2;

import com.shiyunfa.day1.Tool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class SelectTest {
    /**
     * 处理select下拉框的方法
     */
    Tool tool = new Tool();
    WebDriver driver = tool.getDriver();
    WebElement element;

    @Test
    public  void selectTest() throws InterruptedException {
        element = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(element);
        element = driver.findElement(By.xpath("/html/body/select"));
        Select select =new Select(element);
        //遍历select
        List<WebElement> elements = select.getOptions();
        for (WebElement element :elements){
            System.out.println(element.getText());
        }

        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("volvo");
        Thread.sleep(2000);
        select.selectByVisibleText("Audi");
        Thread.sleep(2000);

    }


    @AfterMethod
    public void close(){
        tool.close();
    }
}
