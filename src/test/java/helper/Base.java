package helper;

import com.codeborne.selenide.WebDriverRunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

/**
 * This class is used to control the -ChromeDriver-
 * for the automation tests.
 *
 * @author claudia.madrid
 * */
public class Base {
/**
 * This constructor starts an instance of this Driver.*/
    public Base() {
    }
    /**
     * This method gets the ChromeDriver in the HomePage website, and
     * maximize the windows.
     * */
    public void chromeDriverConnection() {
        open("https://www.demoblaze.com/index.html");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        //With Selenium:
        //System.setProperty("webdriver.chrome.driver", "/Users/claudia.madrid/Documents/UITesting/Drivers/chromedriver_mac_arm64/chromedriver");
        //this.driver = new ChromeDriver();
    }
    /**
     * This method starts connexion with the ChromeDriver
     * before every test starts.
     * */
    @BeforeMethod
    public void setUp() {
        chromeDriverConnection();
    }
    /**
     * This method starts connexion with the ChromeDriver
     * after every test finish.
     * */
    @AfterMethod
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }

}
