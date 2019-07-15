
package runner;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
import org.junit.AfterClass;

import org.junit.runner.RunWith;


import java.io.File;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/"
        ,glue={"steps"}
        ,tags= {"~@LoginTest","~@AddLoanManuallyTest","@InviteBorrowerTest","~@CopyReferralURLTest","~@CoborrowerFlowTest","~@ConnectionTest"}
        ,plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
        )

public class Runner {

        @AfterClass
        public static void writeExtentReport() {
                Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        }

}



