package DEMO.week_1;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

        // Homework: CheckBox - check everything from button, RadioButton - check each except No,
// Menu - Main Item 2 - Sub sublist - sub item 2 - check text using Assert

public class JS extends BaseTest {

    // webdriver works with interface, JSexecutor works only with HTML code

    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.location='https://demoqa.com/text-box'");

        WebElement fullName = driver.findElement(By.id("userName"));

        js.executeScript("arguments[0].setAttribute('style',arguments[1]);",fullName, "border: 2px solid red");
        fullName.sendKeys("John Doe");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.id("userEmail"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);",email, "border: 2px solid orange");
        email.sendKeys("johndoe@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);",currentAddress, "border: 2px solid green");
        currentAddress.sendKeys("New York");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);",permanentAddress, "border: 2px solid blue");
        permanentAddress.sendKeys("Los Angeles");

        WebElement submit = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()",submit);
        Thread.sleep(8000);
    }
}
