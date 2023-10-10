package org.example;

import org.example.driver.ChromeWebDriver;
import org.example.driver.Driver;
import org.example.driver.FirefoxWebDriver;
import org.example.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = ChromeWebDriver.loadChromeDriver();  // static method - use class name.method name
        driver.get("https://demoqa.com/text-box");

/*        WebDriver driver1 = FirefoxWebDriver.loeadFireFoxWebDriver();
        driver.get("https://mvnrepository.com/");*/

        TextBoxPage texBox = new TextBoxPage();
        texBox.fillUpTheFullName("John Doe")
                .fillUpTheEmail("john_doe@gmail.com")
                .fillUpCurrentAddress("Bishkek")
                .fillUpPermanentAddress("Kant")
                .submitButton();

    }
}