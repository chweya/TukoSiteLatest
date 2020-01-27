package commonfunctions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider
{
    Properties pro = new Properties();
    Properties pro1 = new Properties();
    //Constructor that initializes variables and objects
    public ConfigDataProvider()
    {
        try
        {
            String path = System.getProperty("user.dir");
            File src = new File(path +"/src/main/java/commonfunctions/Config.properties");
            File src1 = new File(path +"/src/main/java/commonfunctions/Validation.properties");
            FileInputStream fis = new FileInputStream(src);
            FileInputStream fis1 = new FileInputStream(src1);
            pro.load(fis);
            pro1.load(fis1);
        } catch (Exception e)
        {
            System.out.println("Not able to load config file >>>>" + e.getMessage());
        }
    }

    public String getURL(){return pro.getProperty("url");}
    public String getFBURL(){return pro.getProperty("fb_url");}
    public String getUsername(){return pro.getProperty("email_address");}
    public String getPassword(){return pro.getProperty("password");}
    public String getStoryURL(){return pro1.getProperty("CurrentStoryURL");}
    public String getStoryComment(){return pro.getProperty("post_comment");}
}
