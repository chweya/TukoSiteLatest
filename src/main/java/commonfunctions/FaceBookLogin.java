package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class FaceBookLogin
{
    WebDriver driver;
    public FaceBookLogin(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterCredentials()
    {
        ConfigDataProvider config = new ConfigDataProvider();
        WebElement email_address = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));
        email_address.sendKeys(config.getUsername());
        password.sendKeys(config.getPassword());
        login.click();
    }

    public void validatePost() throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHARLES-QA\\Desktop\\Lori\\chromedriver.exe");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        ConfigDataProvider config = new ConfigDataProvider();
        driver.get(config.getFBURL());
        WebElement email_address = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));
        email_address.sendKeys(config.getUsername());
        password.sendKeys(config.getPassword());
        login.click();

        WebElement profile_name = driver.findElement(By.xpath("(//span[contains(.,'Chweya')])[2]"));
        profile_name.click();

        Thread.sleep(8000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,380)");
        //p[contains(.,'Chweya Charles commented')]
        //WebElement message = driver.findElement(By.xpath("//*[@id=\"js_m\"]"));
        WebElement message = driver.findElement(By.xpath("(//div[contains(@data-testid,'post_message')])[1]"));
        System.out.println("Post Comment is  "+ message.getText());
        WebElement story_title = driver.findElement(By.xpath("(//a[contains(@rel,'noopener nofollow')])[3]"));
        System.out.println("Story title is  "+ story_title.getText());
        story_title.click();
        String post_comment = message.getText();
        System.out.println(post_comment);

        Assert.assertEquals(post_comment,config.getStoryComment());

        String windowHandler = driver.getWindowHandle();// Store the current window handle
        System.out.println(windowHandler);

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(config.getStoryURL()));
        //System.out.println("Current URL is:  "+currentUrl);

        if (currentUrl.contains(config.getStoryURL()))
        {
            System.out.println("Story Title verified successfully");
        }else
            System.out.println("Story Title verification failed");
    }
}

