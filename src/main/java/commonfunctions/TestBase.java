package commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase
{
    public static WebDriver driver = null;
    //ATUTestRecorder recorder;

    @BeforeSuite
    public void launchBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        String path = System.getProperty("user.dir");
        System.out.println(path);
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\CHARLES-QA\\Desktop\\Lori\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", path + "./chromedriver.exe");
        driver = new ChromeDriver(options);
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\CHARLES-QA\\Desktop\\geckodriver.exe");
        //driver = new FirefoxDriver();

        driver.manage().window().maximize();
        ConfigDataProvider config = new ConfigDataProvider();
        driver.get(config.getURL());
    }

    @AfterSuite
    //Test CleanUp
    public void  TearDownTest()
    {
        TestBase.driver.quit();
    }

    public WebDriver getDriver()
    {
        return  driver;
    }
}
