import org.example.models.Student;
import org.example.pages.PracticeFormPage;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticeFormTest extends BaseTest{

    @Test
    void fillUpTheForm() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.createFakeStudent();
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.fillUpTheForm(student)
                .checkStudentDetails(student);

    }
}
