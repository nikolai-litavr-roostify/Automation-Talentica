package roostify.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public WebDriver driver;
    public Properties prop;

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
        return driver;
    }
}
