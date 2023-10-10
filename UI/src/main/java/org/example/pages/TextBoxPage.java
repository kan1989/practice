package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example.driver.Driver.driver;

public class TextBoxPage extends BasePage{
    // Page Object Model - to arrange our work
    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;
    @FindBy(id = "submit")
    public WebElement submitBtn;


    public TextBoxPage fillUpTheFullName(String fullName){
        elementActions.writeText(fullNameInput,fullName);
        return this;
    }
    public TextBoxPage fillUpTheEmail(String email){
        elementActions.writeText(userEmailInput,email);
        return this;
    }
    public TextBoxPage fillUpCurrentAddress(String currentAddress){
        elementActions.writeText(currentAddressInput,currentAddress);
        return this;
    }
    public TextBoxPage fillUpPermanentAddress(String permanentAddress){
        elementActions.writeText(permanentAddressInput,permanentAddress);
        return this;
    }
    public TextBoxPage submitButton(){
        elementActions.clickTheBtn(submitBtn);
        elementActions.scrollToTheElement(submitBtn).clickTheBtn(submitBtn);
        return this;
    }
    public TextBoxPage textBoxPage(){
        return this;
    }

}

// Homework finish DemoQA text box page (finby,method to find, method to fill, check true or false - curad,perad,submit)
