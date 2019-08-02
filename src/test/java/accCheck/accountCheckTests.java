package accCheck;

import listener.TestListener;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.*;
import roostify.accCheck.payLoad;
import roostify.base.base;
import resources.reusableMethods;
import utilities.ReadConfig;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

@Listeners({TestListener.class})
@Epic("Account Check Regression")
@Feature("Verify Account Check functionality")
public class accountCheckTests extends base {

    private Properties prop = new Properties();

    @BeforeTest
    public void getHostURL() throws IOException {


        // FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        //prop.load(fis);
        RestAssured.baseURI = (String) ReadConfig.getVerificationServiceHost();
    }

    @AfterMethod
    public void checkStatus(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            driver.close();
        }
    }

   /* @Test
    public void downloadReport(String verificationId)
    {
        Response res1 =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127").get("/"+verificationId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js1 = ReusableMethods.rawToJson(res1);
        String status = js1.get("verification_status.status");
        Assert.assertEquals(status,"SUCCESS");
        Object doclink=js1.get("verification_status.documents[0]");
        System.out.println(doclink);
        driver.navigate().to((String) doclink);
        System.out.println("Downloaded Report Successfully");
        driver.close();

    }*/



    @Test(priority = 0, description = "Valid scenario with all parameters and sharing Accounts of single bank")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Account check flow with valid scenario")
    public void accCheck_Valild_AccountChek_Flow_with_all_parameters() throws IOException, InterruptedException {
        String Scenarioname="Valild_AccountChek_Flow_with_all_parameters";
//      ExtentTestManager.getTest().log(Status.INFO, "Hey im in Base test1 1");

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String verificationId = js.get("id");
        String srclink = reusableMethods.getSrcLink(data);
       /* System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToDagBank(Scenarioname);
        acp.clickShareAccounts();
        acp.validateSuccessMessage();
        Response res1 =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127").get("/"+verificationId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js1 = ReusableMethods.rawToJson(res1);
        String status = js1.get("verification_status.status");
        Assert.assertEquals(status,"USER_ACTION_COMPLETE");*/

    }


    @Test(priority = 0, description = "Valild Account Check Flow with only mandatory parameters and Sharing Accounts of two different banks")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Account check flow with valid scenario")
    public void accCheck_Valild_AccountChek_Flow_with_only_mandatory_parameters() throws IOException, InterruptedException {
        String Scenarioname="Valild_AccountChek_Flow_with_only_mandatory_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
       /* String srclink = ReusableMethods.getSrcLink(data);
        System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToDagBank(Scenarioname);
        acp.waitForShareAccounts();
        acp.clickAddAnotherAcclnk();
        acp.loginToDagSiteBank();
        acp.clickShareAccounts();
        acp.validateSuccessMessage();*/
    }


    @Test(priority = 1, description = "Null Zip Code and Sharing only one of the two accounts of single bank")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_Zip_Code() throws IOException {

        String Scenarioname="Null_Zip_Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);
        System.out.println(srclink);
        /*Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToDagBank(Scenarioname);
        acp.waitForShareAccounts();
        acp.uncheckFirstAccount();
        acp.clickShareAccounts();
        acp.validateSuccessMessage();*/

    }

    @Test(priority = 1, description = "Null Address line 1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_Address_line_1() throws IOException {

        String Scenarioname="Null_Address_line_1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);
       /* System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToChase(Scenarioname);
        acp.waitForShareAccounts();
        acp.clickShareAccounts();
        acp.validateSuccessMessage();*/


    }

    @Test(priority = 1, description = "Null Last Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_Last_Name() throws IOException {

        String Scenarioname="Null_Last_Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);
       /* System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToWellsForgo(Scenarioname);
        acp.waitForShareAccounts();
        acp.clickShareAccounts();
        acp.validateSuccessMessage();*/

    }

    @Test(priority = 1, description = "Null SSN")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_SSN() throws IOException {

        String Scenarioname="Null_SSN";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null email address")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_email_address() throws IOException {

        String Scenarioname="Null_email_address";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null First Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_First_Name() throws IOException {

        String Scenarioname="Null_First_Name";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }



    @Test(priority = 2, description = "SSN less than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_SSN_less_than_9_digits() throws IOException {

        String Scenarioname="SSN_less_than_9_digits";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "SSN greater than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_SSN_greater_than_9_digits() throws IOException {

        String Scenarioname="SSN_greater_than_9_digits";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid email address1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_email_address1() throws IOException {

        String Scenarioname="Invalid_email_address1";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }
    @Test(priority = 2, description = "Invalid email address2")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_email_address2() throws IOException {

        String Scenarioname="Invalid_email_address2";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid email address3")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_email_address3() throws IOException {

        String Scenarioname="Invalid_email_address3";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid email address4")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_email_address4() throws IOException {

        String Scenarioname="Invalid_email_address4";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid email address5")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_email_address5() throws IOException {

        String Scenarioname="Invalid_email_address5";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid Zip Code")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_Zip_Code() throws IOException {

        String Scenarioname="Invalid_Zip_Code";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid customer id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_customer_id() throws IOException {

        String Scenarioname="Invalid_customer_id";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid account id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_account_id() throws IOException {

        String Scenarioname="Invalid_account_id";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null customer id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_customer_id() throws IOException {

        String Scenarioname="Null_customer_id";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null account id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_account_id() throws IOException {

        String Scenarioname="Null_account_id";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "Invalid verification type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_Invalid_verification_type() throws IOException {

        String Scenarioname="Invalid_verification_type";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null verification type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_verification_type() throws IOException {

        String Scenarioname="Null_verification_type";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null first name last name ssn email verification type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_first_name_last_name_ssn_email_verification_type() throws IOException {

        String Scenarioname="Null_first_name_last_name_ssn_email_verification_type";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 2, description = "zip code less than 5 digits ssn less than 9 null fist and last name invalid email")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Invalid Scenarios")
    public void accCheck_zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email() throws IOException {

        String Scenarioname="zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test(priority = 1, description = "Null cust id and ac id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Account check flow with Null Parameters")
    public void accCheck_Null_cust_id_and_ac_id() throws IOException {

        String Scenarioname="Null_cust_id_and_ac_id";

        given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

}
