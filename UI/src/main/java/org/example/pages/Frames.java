package org.example.pages;

import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    // HW create methods in frameHelper in helper package then check

public class Frames {

    WebDriver driver;

    // html in html
    @BeforeClass
    public void setIp() {
        driver = Driver.getDriver();
    }

    @Test
    void frameSwitch() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");  // switch to nested HTML
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();           // return to main HTML
        WebElement textMain = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(textMain.getText());
    }

    @Test
    void frameMainParentChild() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");  // switch to parent frame
        driver.switchTo().frame(0);            // switch to child frame
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Child Iframe");
        driver.switchTo().parentFrame();             // return to parent frame
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();          // return to main frame
    }
}

