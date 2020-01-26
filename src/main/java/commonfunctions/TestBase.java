package commonfunctions;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestBase
{
    public static WebDriver driver = null;
    ATUTestRecorder recorder;

    @BeforeSuite
    public void launchBrowser() throws ATUTestRecorderException
    {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        Date date = new Date();

        recorder = new ATUTestRecorder("C:\\Users\\CHARLES-QA\\Desktop\\Lori","TestVideo-"+dateFormat.format(date),false);
        recorder.start();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHARLES-QA\\Desktop\\Lori\\chromedriver.exe");
        driver = new ChromeDriver(options);
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\CHARLES-QA\\Desktop\\geckodriver.exe");
        //driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.tuko.co.ke/");
    }

    @AfterSuite
    //Test CleanUp
    public void  TearDownTest() throws ATUTestRecorderException
    {
        TestBase.driver.quit();
        recorder.stop();
    }
}
