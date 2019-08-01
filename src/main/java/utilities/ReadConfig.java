package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    static Properties pro ;

    public ReadConfig()
    {
        File src = new File(System.getProperty("user.dir") +"//Configurations//config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch (Exception e)
        {
            System.out.println("Exception is" +e.getMessage());
        }

    }

    public static  String getChromePath()
    {
        String chromePath = pro.getProperty("chromePath");
        return chromePath;
    }

    public static String getFirefoxPath()
    {
        String firefoxPath = pro.getProperty("firefoxPath");
        return firefoxPath;
    }

    public static String getInternetExplorerPath()
    {
        String InternetExplorerPath = pro.getProperty("explorerpath");
        return InternetExplorerPath;
    }

    public static String getUsername()
    {
        String Username = pro.getProperty("Username");
        return  Username;
    }

    public static String getPassword()
    {
        String Password = pro.getProperty("Password");
        return  Password;
    }

    public static String getBrowser()
    {
        String browser = pro.getProperty("browser");
        return  browser;
    }

    public static String getVerificationServiceHost()
    {
        String  VerificationServiceHost = pro.getProperty("VerificationServiceHost");
        return  VerificationServiceHost;
    }

    public static String getRCoreHost()
    {
        String RCoreHost = pro.getProperty("RCoreHost");
        return  RCoreHost;
    }

    public static String getLenderMailId()
    {
        String LenderEmail = pro.getProperty("LenderId");
        return  LenderEmail;
    }

    public static String getRoostidyAccId()
    {
        String RoostidyAccId = pro.getProperty("RoostifyAccountId");
        return  RoostidyAccId;
    }
}
