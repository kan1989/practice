package DEMO.week_1;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ActionDemo extends BaseTest {

    @Test
    void demo123()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        // class Actions - control pressing buttons
        // Dynamic ID - buttons id can be changed, ex. "id=9pXRs"
        Actions actions = new Actions(driver);
        // make double click
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickCheck = driver.findElement(By.xpath("//p[text() = 'You have done a double click']"));
        Assert.assertEquals(doubleClickCheck.getText(),"You have done a double click");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();

        WebElement rightClickCheck = driver.findElement(By.xpath("//p[text() = 'You have done a right click']"));
        Assert.assertEquals(rightClickCheck.getText(),"You have done a right click");

        WebElement clickBtn = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
        actions.click(clickBtn).perform();

        WebElement clickBtnCheck = driver.findElement(By.xpath("//p[text() = 'You have done a dynamic click']"));
        Assert.assertEquals(clickBtnCheck.getText(),"You have done a dynamic click");

    }

}
