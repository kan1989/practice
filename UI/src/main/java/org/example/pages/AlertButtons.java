package org.example.pages;

import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.example.helper.ScreenShotMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class AlertButtons {

    WebDriver driver;

    @BeforeClass
    public void setIp(){driver = Driver.getDriver();}

    @Test
    void test1() throws InterruptedException, IOException {
        driver.get("https://demoqa.com/alerts");

/*        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        // wait 5 seconds until alert appears
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // confirm alert or cancel - select cancel
        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        // enter text in alert
        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("Nuta");
        alert.accept();*/

        AlertHelper alertHelper = new AlertHelper();

        driver.findElement(By.id("alertButton")).click();
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.acceptDismiss();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.textInput("Hi!");

        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        screenShotMethods.takeScreenShot();




    }

}
