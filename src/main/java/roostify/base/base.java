package roostify.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.ReadConfig;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public String filePath="";
    ReadConfig rc = new ReadConfig();

   /* public Base() {
        this.filePath = createTestRunFolder();
    }*/


    public WebDriver initialzeDriver(){
        //WebDriver driver = null;
        //Properties prop = new Properties();
       // FileInputStream fis;
        String testBrowser = ReadConfig.getBrowser();
        if(testBrowser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +ReadConfig.getChromePath());
            driver = new ChromeDriver();

        }

        else if(testBrowser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") +ReadConfig.getFirefoxPath());
            driver = new FirefoxDriver();
        }

        else if(testBrowser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + ReadConfig.getInternetExplorerPath());
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



//        try {
//            String testBrowser = rc.getBrowser();
//                    //prop.getProperty("browser");
//
//            if (browsername.equals("Chrome")) {
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
//                //WebDriverManager.getInstance(CHROME).setup();
//                driver = new ChromeDriver();
//                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//                driver.manage().window().maximize();
//
//            }
//
//        }
//        catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

      // this.filePath=createTestRunFolder();
       // System.out.println(this.filePath);
        return driver;
    }
    public  String createTestRunFolder()
    {
        String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        File file = new File(System.getProperty("user.dir") + "//Screenshots//TestRun_"+timestamp+"");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }

        return file.getPath();
    }

    public void captureScreenMethod() throws IOException {
        //System.out.println(this.filePath);
        String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"//Screenshots//Screenshot_"+timestamp+".png"));
    }
}
