package DEMO.week_1;

// HW: https://demoqa.com/text-box - Elements->Practice form - find elements and save in WebElements

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends BaseTest {

    @Test
    void fillUpTheFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");  // get URL

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys("John Dong");
        String expectedFullName = "John Dong";

        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        emailInputField.sendKeys("john@gmail.com");
        String expectedEmail = "john@gmail.com";

        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        currentAddressInputField.sendKeys("3, 21, Urasa, Minamiuonuma-shi, Niigata-ken, Japan");
        String expectedCurrentAddress = "3, 21, Urasa, Minamiuonuma-shi, Niigata-ken, Japan";

        WebElement permanentAddressInputField = driver.findElement(By.id("permanentAddress"));
        permanentAddressInputField.sendKeys("3-4-4, Shinjuku-shi, Tokyo-to, Japan");
        String expectedPermanentAddress = "3-4-4, Shinjuku-shi, Tokyo-to, Japan";

        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);   // scroll page until submit button
        submitBtn.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAddress));

        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAddress));

    }

}
