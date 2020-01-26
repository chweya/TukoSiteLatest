package pages;

import commonfunctions.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
    }

//    @Test(priority = 3)
//    public void scrollToLink() throws InterruptedException
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.scrollToElement();
//    }
//
//    @Test(priority = 4)
//    public void clickPageLink()
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.getPageLink();
//    }

//    @Test(priority = 5)
//    public void facebookIcon()
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
////        latest.searchFaceBookIcon();
////    }
//
//    @Test(priority = 6)
//    public void postStory() throws InterruptedException
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.postStory();
//    }
//
//    @Test(priority = 7)
//    public void publishStory() throws InterruptedException
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.publishStory();
//    }

//    @Test(priority = 7)
//    public void loginToFacebook()
//    {
//        FaceBookLogin fb = PageFactory.initElements(driver,FaceBookLogin.class);
//        fb.enterCredentials();
//    }

//    @Test(priority = 4)
//    public void getPageTitle() throws InterruptedException {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.getStoryHeading();
//    }

//    @Test(priority = 5)
//    public void navigateToFaceBook()
//    {
//        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
//        latest.navigateToFaceBook();
//    }
}
