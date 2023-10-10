package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class Driver {
    public Driver() {
        // Singleton patter
    }
    public static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loeadFireFoxWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        } return driver;
    }
    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver=null;
            }
        } catch (Exception e){
            System.out.println("Error while closing the driver");
        }
    }
}


