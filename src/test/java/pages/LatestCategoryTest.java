package pages;

import commonfunctions.FaceBookLogin;
import commonfunctions.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class LatestCategoryTest extends TestBase
{
    @Test(priority = 1)
    public void navigateToLatestNews()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.clickLatestCategory();
    }

    @Test(priority = 2)
    public void getAllPageLinks()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.getAllPageLinks();
    //0704903554: celestine
    }

    @Test(priority = 3)
    public void scrollToLink()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.scrollToElement();
    }

    @Test(priority = 4)
    public void clickPageLink()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.getPageLink();
    }

    @Test(priority = 5)
    public void postStory() throws IOException
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.postStory();
    }

    @Test(priority = 7)
    public void publishStory() throws InterruptedException {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.publishStory();
    }

    @Test(priority = 8)
    public void validatePost() throws InterruptedException
    {
        FaceBookLogin fb = PageFactory.initElements(driver,FaceBookLogin.class);
        fb.validatePost();
    }

}
