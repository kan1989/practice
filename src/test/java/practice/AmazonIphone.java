package practice;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonIphone extends BaseTest {
    @Test
    void Iphone15Case(){

        driver.get("https://www.amazon.com/s?k=iphone+15+pro+max+case&crid=10F5OREHSO6JL&sprefix=iphone%2Caps%2C567&ref=nb_sb_ss_ts-doa-p_1_6");
        WebElement textPelicanCase = driver.findElement(By.xpath("//*[contains(text(),'Pelican Protector')]"));
        // WebElement textPelicanCase = driver.findElement(By.xpath("//span[contains(text(),'Pelican Protector')]"));
        System.out.println(textPelicanCase.getText());
    }
}
