package DEMO.week_2;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class BrowserWindows extends BaseTest {

    @Test
    void windowsTest () throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(1000);
        Assert.assertEquals(sample.getText(),"This is a sample page");
        Thread.sleep(3000);
    }
    @Test
    void newWindowTest () throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("windowButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));
        WebElement sample1 = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(1000);
        Assert.assertEquals(sample1.getText(),"This is a sample page");
        Thread.sleep(3000);
    }
    @Test
    void newWindowMessage () throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs);
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        WebElement sample2 = driver.findElement(By.xpath("/html/body"));
        System.out.println(sample2.getText());
        Assert.assertTrue(sample2.getText().contains("Knowledge"));
    }
}
