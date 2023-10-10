package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.driver.Driver;
import org.example.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static org.example.driver.Driver.driver;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    protected ElementActions elementActions = new ElementActions();

    public static WebDriver driver;

    @BeforeClass
        public void Basic(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
