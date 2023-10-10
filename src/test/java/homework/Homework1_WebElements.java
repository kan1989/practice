package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework1_WebElements {

    @Test
    void fillUpTheForm(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameInputField = driver.findElement(By.id("firstName"));
        firstNameInputField.sendKeys("Jackie");
        String expectedFirstName = "Jackie";

        WebElement lastNameInputField = driver.findElement(By.id("lastName"));
        lastNameInputField.sendKeys("Chan");
        String expectedLastName = "Chan";

        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        emailInputField.sendKeys("jackie_chan@gmail.com");
        String expectedEmail = "jackie_chan@gmail.com";

        WebElement genderMaleBtn = driver.findElement(By.xpath("//input[@id ='gender-radio-1']"));
        WebElement genderFemaleBtn = driver.findElement(By.xpath("//input[@id ='gender-radio-2']"));
        WebElement genderOtherBtn = driver.findElement(By.xpath("//input[@id ='gender-radio-3']"));

        WebElement numberInputField = driver.findElement(By.id("userNumber"));
        numberInputField.sendKeys("+8196034345");
        String expectedNumber = "+8196034345";

        WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",dateOfBirthField);
        dateOfBirthField.click();
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        yearElement.sendKeys("1989");

        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        monthElement.sendKeys("July");

        WebElement dayElement = driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, July 26th, 1989']"));
        dayElement.click();

        WebElement subjectsContainer = driver.findElement(By.id("subjectsContainer"));
        subjectsContainer.sendKeys("Econometrics, Statistic Methods, Survey Data Analysis");
        String expectedSubjects = "Econometrics, Statistic Methods, Survey Data Analysis";

        WebElement hobbyCheck1 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-1']"));
        WebElement hobbyCheck2 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-2']"));
        WebElement hobbyCheck3 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-3']"));

        WebElement uploadPictureField = driver.findElement(By.id("uploadPicture"));

        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        currentAddressInputField.sendKeys("3, 21, Urasa, Minamiuonuma-shi, Niigata-ken, Japan");
        String expectedCurrentAddress = "3, 21, Urasa, Minamiuonuma-shi, Niigata-ken, Japan";

        WebElement stateChooseBtn = driver.findElement(By.xpath("//p[@class=' css-1uccc91-singleValue'"));

        WebElement cityChooseBtn = driver.findElement(By.xpath("//p[@class=' css-1uccc91-singleValue'"));

    }
}
