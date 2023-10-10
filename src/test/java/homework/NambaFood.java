package homework;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class NambaFood extends BaseTest {

    @Test (priority = 1)
    void mixFoodChoose()
    {
        driver.get("https://nambafood.kg/mix-food-bishkek");

        WebElement wingsCount = driver.findElement(By.xpath("/html/body/main/section[2]/div/span/div/div[2]/div[2]/div[2]/div[2]"));
        for (int i=0; i<2; i++) {
            wingsCount.click();
        }
        WebElement wingsOrder = driver.findElement(By.xpath("//*[@id=\"3866\"]/div/div[2]/div[2]/button"));
        wingsOrder.click();

        WebElement guiruLagmanCount = driver.findElement(By.xpath("//*[@data-item-name='Гуйру лагман']/div[2]/div[2]"));
        for (int i=0; i<2; i++) {
            guiruLagmanCount.click();
        }
        WebElement guiruLagmanOrder = driver.findElement(By.xpath("//*[@data-item-name='Гуйру лагман']/button"));
        guiruLagmanOrder.click();

        WebElement hotGarlicSauceOrder = driver.findElement(By.xpath("//*[@data-item-name='Острый чесночный соус']/button"));
        hotGarlicSauceOrder.click();
    }
    @Test (priority = 2)
    void orderFood()
    {
        driver.get("https://nambafood.kg/mix-food-bishkek/make-order");

        WebElement pressOrderBtn = driver.findElement(By.xpath("//*[@class='order--btn order--access']"));
        pressOrderBtn.click();
    }
    @Test (priority = 3)
    void checkOut()
    {
        driver.get("https://nambafood.kg/mix-food-bishkek/checkout");

        WebElement name = driver.findElement(By.id("food_order_client_name"));
        name.sendKeys("Tom & Jerry");

        WebElement address = driver.findElement(By.id("food_order_address"));
        address.sendKeys("Baker Street 777");

        WebElement door = driver.findElement(By.id("food_order_door_code"));
        door.sendKeys("3-45");

        WebElement phone = driver.findElement(By.id("food_order_phone"));
        phone.sendKeys("0777463209");

        WebElement addInfo = driver.findElement(By.id("food_order_additional_info"));
        addInfo.sendKeys("Please, do not deliver it");

        WebElement dateTime = driver.findElement(By.xpath("//*[@class='order--form-item order--radio']/label[2]"));
        dateTime.click();

        WebElement dateOfBirthField = driver.findElement(By.id("datepicker--confirmation"));
        dateOfBirthField.click();
        WebElement yearElement = driver.findElement(By.className("//*[@class='xdsoft_label xdsoft_month']"));
        yearElement.sendKeys("Сентябрь");

        WebElement monthElement = driver.findElement(By.className("//*[@class='xdsoft_label xdsoft_year']"));
        monthElement.sendKeys("2023");

        WebElement dayElement = driver.findElement(By.xpath("//*[@class='xdsoft_calendar']/table/tbody/tr[4]/td[5]"));
        dayElement.click();

        WebElement timeElement = driver.findElement(By.xpath("//*[@class='xdsoft_time_variant']/div[130]"));
        timeElement.click();

        WebElement paymentBalanceKG = driver.findElement(By.xpath("//*[@class='resp-accordion resp-tab-active']"));
        paymentBalanceKG.click();

        WebElement paymentOrderBtn = driver.findElement(By.xpath("//*[@class='payments-tab--balance resp-tab-content resp-tab-content-active']/div/div[5]/button"));
        paymentBalanceKG.click();


    }

}
