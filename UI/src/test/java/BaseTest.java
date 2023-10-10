import com.digital.utils.FakeDataProvider;
import org.example.driver.Driver;
import org.example.pages.PracticeFormPage;
import org.example.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormTest practiceFormTest;
    public FakeDataProvider fakeDataProvider;

    public PracticeFormPage practiceFormPage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormTest = new PracticeFormTest();
        fakeDataProvider = new FakeDataProvider();
        practiceFormPage = new PracticeFormPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}
