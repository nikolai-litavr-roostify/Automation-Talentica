package roostify.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public String filePath="";

   /* public Base() {
        this.filePath = createTestRunFolder();
    }*/

    public Properties initializeprop() {
        Properties prop = new Properties();
        FileInputStream fis1;

        try {
            fis1 = new FileInputStream("src\\main\\java\\Resources\\data.properties");
            prop.load(fis1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return prop;
    }

    public WebDriver initialzeDriver() throws IOException {
        //WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
            prop.load(fis);
            String browsername = "Chrome";
                    //prop.getProperty("browser");

            if (browsername.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
                //WebDriverManager.getInstance(CHROME).setup();
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();

            }


        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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
