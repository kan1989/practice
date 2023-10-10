package DEMO.week_2;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends BaseTest {

/*    @Test
    void demo1() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");  // remember previous pages (get cannot)
        driver.findElement(By.xpath("(//a[@href='/food')[1]"));
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);

    }*/

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
/*        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(selectColor);
        select.selectByVisibleText("Green");
        Thread.sleep(3000);

        select.selectByValue("4");  // purple
        Thread.sleep(3000);

        select.selectByIndex(7);    // violet
        Thread.sleep(3000);*/

        // deselect works only with multiselectable elements (like checkbox)
        /* List<WebElement> getOptions = select.getOptions();
       for (WebElement options : getOptions){
            System.out.println(options.getText());
        }*/

        WebElement sleepReact = driver.findElement(By.id("withOptGroup"));
        WebElement dropdownClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        dropdownClick.click();
        WebElement inputText = driver.findElement(By.id("react-select-2-input"));

        List<WebElement> menuItem = sleepReact.findElements(By.xpath("./div[2]//div[contains(text(), 'Group') or contains(text(), 'root option')]"));
        List<String> menuItemValue = new ArrayList<>();

        for (WebElement item : menuItem) {
            String text = item.getText();
            if (!text.equals("GROUP 1") && !text.equals("GROUP 2")) {
                menuItemValue.add(text);
            }
        }
        Random random = new Random();
        int itemsToSelect = random.nextInt(menuItemValue.size());
        inputText.sendKeys(menuItemValue.get(itemsToSelect));
        inputText.sendKeys(Keys.ENTER);


        // random selects practice
/*    public void selectRandom(Select select, List<WebElement> getOptions){

        Random randomColor = new Random();
        int indexColor = randomColor.nextInt(getOptions.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);
     }*/
    }
}




