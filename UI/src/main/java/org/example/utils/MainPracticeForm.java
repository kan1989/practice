package org.example.utils;

import org.example.driver.Driver;
import org.example.models.Student;
import org.example.pages.BasePage;
import org.example.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.example.driver.Driver.driver;

import java.awt.*;


public class MainPracticeForm {

    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        com.digital.utils.FakeDataProvider fakeDataProvider = new com.digital.utils.FakeDataProvider();
        Student student= new Student();
        student.setFirstName("Jyldyz");
        student.setLastName("Jeenbaeva");
        student.setEmail("Jilduz@gmail.com");
        student.setCurrentAddress("Lenina 268");
        student.setPhoneNumber("9965553570");
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.fillUpTheForm(student).checkStudentDetails(student);



//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
//                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
//                .clickGender()
//                .clickHobbies()
//                .selectState()
//                .selectSubject()
//                .selectSubject()
//                .selectSubject()
//                .setUploadPicture()
//                .selectSubmitBtn();
                Thread.sleep(5000);
                Driver.closeDriver();

            }
        }

