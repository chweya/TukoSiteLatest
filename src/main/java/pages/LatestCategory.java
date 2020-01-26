package pages;

import commonfunctions.FaceBookLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LatestCategory
{
    WebDriver driver;
    public LatestCategory(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[@class='c-header-menu__link'][contains(.,'Latest')]") WebElement latest_link;

    public void clickLatestCategory()
    {
        latest_link.click();
    }

    public void getPageLink()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'headline-hover-inner')])[13]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void getAllPageLinks()
    {
        java.util.List<WebElement> links = driver.findElements(By.className("c-article-card-no-border__headline-hover-inner"));
        System.out.println(links.size());

        for(int i =0; i< links.size(); i++)
        {
            System.out.println(links.get(i).getText());
        }
    }

    public void scrollToElement() throws InterruptedException
    {
        WebElement element_link = driver.findElement(By.xpath("(//span[contains(@class,'headline-hover-inner')])[12]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element_link);
        Thread.sleep(10000);

    }
    public void searchFaceBookIcon()
    {
        WebElement element = driver.findElement(By.xpath("(//strong[contains(.,'READ ALSO')])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void postStory() throws InterruptedException
    {
        WebElement fb_element = driver.findElement(By.xpath("//a[@class='c-article-share-item']"));
        fb_element.click();
        Thread.sleep(10000);
        String windowHandler = driver.getWindowHandle();// Store the current window handle
        System.out.println(windowHandler);

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }
        FaceBookLogin fb = PageFactory.initElements(driver,FaceBookLogin.class);
        fb.enterCredentials();
        //Actions actions = new Actions(driver);
        //actions.moveToElement(fb_element).click().perform();
    }

    public void publishStory() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement publish = driver.findElement(By.xpath("//span[contains(.,'Post to Facebook')]"));
        WebElement say_something = driver.findElement(By.xpath("//textarea[contains(@title,'Say something about this...')]"));
        WebElement story_title = driver.findElement(By.xpath("//div[contains(@class,'unclickableMask')]"));
        story_title.getText();
        System.out.println("The story title is  "+ story_title);
        //(//div[contains(@data-testid,'post_message')])[1]
                //(//a[contains(@rel,'noopener nofollow')])[3]
        say_something.sendKeys("This is for Demo");
        publish.click();
        Thread.sleep(1000);
        //span[contains(.,'Post to Facebook')]
    }
}
