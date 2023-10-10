package org.example.helper;

import lombok.Data;
import org.example.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.Driver.driver;
@Data
public class AlertHelper {

    Alert alert;
    public AlertHelper waitAndSwitch (){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        return this;
    }
    public AlertHelper acceptAlert (){
        waitAndSwitch();
        alert.accept();
        return this;
    }
    public AlertHelper acceptDismiss (){
        waitAndSwitch();
        alert.dismiss();
        return this;
    }
    public AlertHelper textInput (String txt){
        waitAndSwitch();
        alert.sendKeys(txt);
        acceptAlert();
        return this;
    }

}
