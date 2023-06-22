package helper;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import org.openqa.selenium.chrome.ChromeOptions;
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
        System.setProperty("selenide.browser", "edge");
        open("https://www.demoblaze.com/index.html");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        //With Selenium:
        //System.setProperty("webdriver.chrome.driver", "/Users/claudia.madrid/Documents/UITesting/Drivers/chromedriver_mac_arm64/chromedriver");
        //this.driver = new ChromeDriver();
    }
    public void edgeDriverConnection() {
        System.setProperty("selenide.browser", "edge");
        Configuration.timeout = 20000;
        Configuration.baseUrl = "https://www.demoblaze.com/index.html";
        open("https://www.demoblaze.com/index.html");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    /**
     * This method starts connexion with the ChromeDriver
     * before every test starts.
     * */
    @BeforeMethod
    public void setUp() {


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
        edgeDriverConnection();
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
