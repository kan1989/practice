package DEMO.week_2;

import DEMO.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dynamic extends BaseTest {

    @FindBy (id = "enableAfter")
    public WebDriver enableAfterBtn;
    @FindBy (xpath = "//button[@id='colorChange']")
    public WebDriver colorChangeBtn;
    @FindBy (id = "visibleAfter")
    public WebDriver visibleAfterBtn;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

    public Dynamic clickAfter5 (WebElement enableAfterBtn){
        wait.until(ExpectedConditions.elementToBeClickable(enableAfterBtn));
        return this;
    }
    public Dynamic clickVisible (WebElement visibleAfterBtn) {
        wait.until(ExpectedConditions.visibilityOf(visibleAfterBtn));
        return this;
    }
    @Test
    public void clickclick () {
        Dynamic dynamic = new Dynamic();
        dynamic.clickAfter5((WebElement) enableAfterBtn).clickVisible((WebElement) visibleAfterBtn);
    }

}
