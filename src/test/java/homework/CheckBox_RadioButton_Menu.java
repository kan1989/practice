package homework;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox_RadioButton_Menu extends BaseTest {

    @Test (priority = 1)
    void artOfTesting ()
    {
        driver.get("https://artoftesting.com/samplesiteforselenium");

        WebElement textBox = driver.findElement(By.cssSelector("#fname"));
        textBox.sendKeys("I used this website instead of DemoQA");

        WebElement submitBtn = driver.findElement(By.id("idOfButton"));
        submitBtn.click();

/*        WebElement doubleClickBtn = driver.findElement(By.xpath("//*[@id='commonWebElements']/p[3]/button[2]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();*/

        WebElement radioBtnMale = driver.findElement(By.xpath("//*/input[@id='male']"));
        radioBtnMale.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*/input[@type='checkbox']"));
        for (WebElement checkBox:checkBoxes) {
            checkBox.click();
        }

        WebElement dropDownMenu = driver.findElement(By.id("testingDropdown"));
        dropDownMenu.click();
        WebElement databaseOption = driver.findElement(By.id("database"));
        databaseOption.click();
    }
}
