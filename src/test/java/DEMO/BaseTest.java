package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.time.Duration;

public abstract class BaseTest {

    public WebDriver driver;
    Actions actions;

    JavascriptExecutor js;

    @BeforeClass
    public void setupBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96");
        WebDriverManager.chromedriver().setup();    // setup chrome driver - access to chrome
        // class ChromeDriver extends Chromium engine
        driver = new ChromeDriver();      // interface Webdriver let us control browser page

        driver.manage().window().maximize();        // maximize (fullScreen) chrome window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // setup the time - wait before run

        PageFactory.initElements(driver,this);

        driver.get("https://demoqa.com/dynamic-properties");

    }


/*    @AfterClass
    public void tearDown(){
        driver.close(); // close current window
        driver.quit();  // quit Webdrivers and close all windows
    }*/

}
