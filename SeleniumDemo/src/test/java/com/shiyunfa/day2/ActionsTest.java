package com.shiyunfa.day2;

import com.shiyunfa.day1.Tool;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class ActionsTest {
    /**
     * 操作页面元素方法
     */
    Tool tool = new Tool();
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){
        driver = tool.getDriver();

    }

    @Test
    public void sout() throws InterruptedException {
        WebElement newLink = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[6]"));
        newLink.getAttribute("su"); //  传入什么属性 获取什么属性
        newLink.isSelected();//判断选择框是否被选中
        newLink.isEnabled();//判断元素处于未激活状态
        System.out.println("title="+driver.getTitle()); //获取页面的title值
        Assert.assertTrue(newLink.isDisplayed(),"没有显示出来哦");//isDisplayed（）判断元素是否是展示状态

//      截图页面
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("D:\\test1.png" ));
        }catch (IOException e){
            e.printStackTrace();
        }
        //清空文本框内容
        //newLink.clear();
        //Thread.sleep(3000);
        //点击方法
        //newSubmit.click();
        //获取当前页面的url
        //String url = driver.getCurrentUrl();
        Thread.sleep(3000);

        /**
         * 点击Alter里面的确定按钮
         */
        //把控制权交给alert
        Alert alert = driver.switchTo().alert();
        //把控制权交给iframe
        driver.switchTo().frame("id");
        //选择确定按钮
        alert.accept();
        //选择取消按钮
        alert.dismiss();
        //获取弹窗的text文本
        alert.getText();
        //输入文本
        alert.sendKeys("");

    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
