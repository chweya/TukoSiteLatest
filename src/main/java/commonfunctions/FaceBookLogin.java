package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FaceBookLogin
{
    WebDriver driver;
    public FaceBookLogin(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterCredentials()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement email_address = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));
        email_address.sendKeys("chweyaacharles@gmail.com");
        password.sendKeys("kakamega12");
        login.click();
        //driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("chweyaacharles@gmail.com");
        //driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("kakamega12");
        //driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
    }

    public void facebookValidation()
    {

    }
}

