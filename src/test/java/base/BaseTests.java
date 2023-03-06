package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import page.HomePage;
import page.LoginPage;
import page.RegisterPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private final String WEB_TESTING = "https://www.tokopedia.com/";
    private WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\Data\\WIKU_YOGA_NDARU\\SELENIUM\\library\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to(WEB_TESTING);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
    }

}
