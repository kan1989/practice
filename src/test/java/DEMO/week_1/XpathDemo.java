package DEMO.week_1;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo extends BaseTest {

    @Test
    void hierarchicalXpathAbsolute() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        firstName.sendKeys("Bobby");
        Thread.sleep(3000);
    }
    @Test
    void relativeXpath() throws InterruptedException {

        // #text - check is exist

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Brown");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("bbrown@gmail.com");

        WebElement mobileNumber = driver.findElement(By.xpath("//*[@placeholder='Mobile Number']"));
        mobileNumber.sendKeys("996555112233");

        WebElement formName = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));
        WebElement formNameContains = driver.findElement(By.xpath("//*[contains(text(),'Student')]"));

        WebElement findByPath = driver.findElement(By.xpath("//form/div[2]/div/label"));

        WebElement findIfSeveralSameIdExist = driver.findElement(By.xpath("(//*[@id='currentAddress'])[1]"));

        WebElement findParentalElement = driver.findElement(By.xpath("(//*[@id='genterWrapper'])[1]/../.."));


    }
}
