
package runner;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.runner.RunWith;


import java.io.File;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/"
        ,glue={"steps"}
        ,tags= {"@LoginTest"}
        ,plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
        )

//@AddLoanManuallyPreUSDATest, @AddLoanManuallyPreVaTest, @AddLoanManuallyPreFHATest, @AddLoanManuallyPreConTest, @InviteBorrowerTest, @CopyReferralURLTest, @ConnectionTest

public class Runner {
        @AfterClass
        public static void writeExtentReport() {
                Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
                Reporter.setSystemInfo("Machine", "Windows 10 " + "64 Bit");
                Reporter.setSystemInfo("Selenium", "3.7.0");
                Reporter.setSystemInfo("Maven", "4.0.0");
                Reporter.setSystemInfo("Java Version", "1.8.0_181");
        }

}



