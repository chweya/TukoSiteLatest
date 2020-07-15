package pages;

import commonfunctions.FaceBookLogin;
import commonfunctions.TestBase;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class LatestCategoryTest extends TestBase
{
    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 1)
    public void navigateToLatestNews()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.clickLatestCategory();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 2)
    public void getAllPageLinks()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.getAllPageLinks();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 3)
    public void scrollToLink() throws InterruptedException {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.scrollToElement();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 4)
    public void clickPageLink()
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.getPageLink();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 5)
    public void postStory() throws IOException
    {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.postStory();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 7)
    public void publishStory() throws InterruptedException {
        LatestCategory latest = PageFactory.initElements(driver,LatestCategory.class);
        latest.publishStory();
    }

    @Epic("Lori Tuko Website Automation")
    @Feature("Automated Page : Latest Category")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("chweyaacharles@gmail.com")
    @Test(priority = 8)
    public void validatePost() throws InterruptedException
    {
        FaceBookLogin fb = PageFactory.initElements(driver,FaceBookLogin.class);
        fb.validatePost();
    }

}
