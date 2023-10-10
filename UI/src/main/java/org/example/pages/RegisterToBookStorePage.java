package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterToBookStorePage extends BasePage{

    @FindBy(id = "firstname")
    public WebElement firstnameInput;
    @FindBy(id = "lastname")
    public WebElement lastnameInput;
    @FindBy(id = "userName")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement recaptchaMark;
    @FindBy(id = "register")
    public WebElement registerButton;

/*    public RegisterToBookStorePage inputFirstname(){
        elementActions.writeText(lastnameInput,txt);
        return this;
    }*/



    // HW Create user then login (recaptcha - javascript executor)
}
