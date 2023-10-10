package DEMO.week_1;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.accessibility.AccessibleRelation;

public class MoveToElement extends BaseTest {

    @Test
    void scroll() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.location='https://demoqa.com/text-box'");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys("John Dong");

        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        emailInputField.sendKeys("john@gmail.com");

        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        currentAddressInputField.sendKeys("3, 21, Urasa, Minamiuonuma-shi, Niigata-ken, Japan");

        WebElement permanentAddressInputField = driver.findElement(By.id("permanentAddress"));
        permanentAddressInputField.sendKeys("3-4-4, Shinjuku-shi, Tokyo-to, Japan");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitBtn);
        js.executeScript("arguments[0].click()",submitBtn);
        Thread.sleep(8000);
    }
}
