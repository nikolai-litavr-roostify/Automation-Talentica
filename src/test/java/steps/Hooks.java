//package steps;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import cucumber.TestContext;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import managers.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import com.cucumber.listener.Reporter;
//
//public class Hooks {
//
//
//    public static WebDriver driver;
//
//    @Before
//    public void BeforeSteps()
//    {
//        WebDriverManager webDriverManager = new WebDriverManager();
//        driver = webDriverManager.getDriver();
//        driver = webDriverManager.getUrl();
//    }
//
//
//
////    @Before
////    public void beforeScenario(Scenario scenario) {
////        extentTest.assignAuthor("Vivek Wagh");
////    }
//
////    @After
////    public void AfterSteps() {
////        testContext.getWebDriverManager().closeDriver();
////    }
//
//}
