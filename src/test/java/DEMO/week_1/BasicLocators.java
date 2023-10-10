package DEMO.week_1;
    // Locators: by.ID, by.xpath, by.className, by.tagName, by.css, by.linkedText, by.partialLinkText

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest {

    @Test
    void byIdTest(){
        WebElement userName = driver.findElement(By.id("userName"));
    }
    @Test
    void byTagName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byTag = driver.findElement(By.tagName("h5"));
        System.out.println(byTag.getText());
    }
    @Test
    void byClassName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClass = driver.findElement(By.className("main-header"));
        System.out.println(byClass.getText());
    }
    @Test
    void byLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement byLinkText = driver.findElement(By.linkText("Home"));
        System.out.println(byLinkText.getText());
    }
    @Test
    void byPartialLinkText(){
        driver.get("https://demoqa.com/links");
        WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Bad"));
        System.out.println(byPartialLinkText.getText());
    }
    @Test
    void byName(){
        driver.get("https://demoqa.com/links");
        WebElement byName = driver.findElement(By.name("google_esf"));
        System.out.println(byName.getText());
    }


}
