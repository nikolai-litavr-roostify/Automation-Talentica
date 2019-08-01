package plaid;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import listener.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import roostify.base.Base;
import roostify.plaid.payLoad;
import resources.ReusableMethods;
import roostify.plaid.PlaidPortalPage;
import utilities.ReadConfig;
import java.io.IOException;
import static io.restassured.RestAssured.given;


@Listeners({TestListener.class})
@Epic("Plaid Regression")
@Feature("Verify Plaid functionality")
public class PlaidTests extends Base {

    @BeforeTest
    public void  getHostURL(){

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


    @Test
    public void downloadReport(String verificationId)
    {
        PlaidPortalPage ppp = new PlaidPortalPage(driver);
        String status= "";
        Object doclink=null;
        String expected="SUCCESS";
        boolean flag=true;

        do{
            Response res1 =
                    given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127").get("/"+verificationId+"").then().assertThat().statusCode(200).extract().response();
            JsonPath js1 = ReusableMethods.rawToJson(res1);

            status = js1.get("verification_status.status");
            doclink=js1.get("verification_status.documents[0]");
            ppp.sleep();
            if (status.equalsIgnoreCase(expected))
            {
                flag=false;
            }

        }while(flag);
        System.out.println(doclink);
        driver.navigate().to((String) doclink);
        ppp.sleep();
        System.out.println("Downloaded Report Successfully");
        driver.close();

    }

    @Test(priority = 0, description = "Valild Plaid Flow with all parameters and submitting accounts from single bank")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Plaid flow with valid scenario")
    public void Valild_Plaid_Flow_with_all_parameters() throws IOException {
        String Scenarioname="Valild Plaid Flow with all parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String verificationId=js.get("id");
        String srclink = js.get("links[0].resource_location");
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        PlaidPortalPage ppp = new PlaidPortalPage(driver);
        ppp.loginToCitiBank(Scenarioname);
        ppp.validateSuccessMessage();
        downloadReport(verificationId);

    }


    @Test(priority = 0, description = "Valild Plaid Flow with only mandatory parameters and submitting accounts from multiple banks")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Plaid flow with valid scenario")
    public void Valild_Plaid_Flow_with_only_mandatory_parameters() throws IOException {
        String Scenarioname = "Valild Plaid Flow with only mandatory parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String srclink = js.get("links[0].resource_location");
        String verificationId=js.get("id");
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        PlaidPortalPage ppp = new PlaidPortalPage(driver);
        ppp.loginToCitiBank(Scenarioname);
        ppp.loginToChase();
        ppp.validateSuccessMessage();
        downloadReport(verificationId);
    }

    @Test(priority = 1, description = "Null Zip Code")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_Zip_Code() throws IOException {
        String Scenarioname = "Null Zip Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Zip Code")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_Address_line_1() throws IOException {
        String Scenarioname = "Null Address line 1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Last Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_Last_Name() throws IOException {
        String Scenarioname = "Null Last Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null SSN")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_SSN() throws IOException {
        String Scenarioname = "Null SSN";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null email address")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_email_address() throws IOException {
        String Scenarioname = "Null email address";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null First Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_First_Name() throws IOException {
        String Scenarioname = "Null First Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


    @Test(priority = 2, description = "SSN less than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void SSN_less_than_9_digits() throws IOException {
        String Scenarioname = "SSN less than 9 digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "SSN greater than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void SSN_greater_than_9_digits() throws IOException {
        String Scenarioname = "SSN greater than 9 digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid email address1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_email_address1() throws IOException {
        String Scenarioname = "Invalid email address1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid email address2")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_email_address2() throws IOException {
        String Scenarioname = "Invalid email address2";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


    @Test(priority = 2, description = "Invalid email address3")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_email_address3() throws IOException {
        String Scenarioname = "Invalid email address3";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid email address4")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_email_address4() throws IOException {
        String Scenarioname = "Invalid email address4";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid email address5")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_email_address5() throws IOException {
        String Scenarioname = "Invalid email address5";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid Zip Code")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_Zip_Code() throws IOException {
        String Scenarioname = "Invalid Zip Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_customer_id() throws IOException {
        String Scenarioname = "Invalid customer_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_account_id() throws IOException {
        String Scenarioname = "Invalid account_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_customer_id() throws IOException {
        String Scenarioname = "Null customer_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_account_id() throws IOException {
        String Scenarioname = "Null account_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid verification_type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_verification_type() throws IOException {
        String Scenarioname = "Invalid verification_type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Verification Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_verification_type() throws IOException {
        String Scenarioname = "Null verification_type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null first name, last name, ssn")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_first_name_last_name_ssn() throws IOException {
        String Scenarioname = "Null first name, last name, ssn";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 2, description = "Invalid Zip Code, SSN, Email, Null first and last name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void zip_code_less_than_5_digits_ssn_less_than_9_null_first_and_last_name_invalid_email() throws IOException {
        String Scenarioname = "zip code less than 5 digits, ssn less than 9, null fist and last name, invalid email";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Null Customer Id and Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Null Parameters")
    public void Null_cust_id_and_ac_id() throws IOException {
        String Scenarioname = "Null cust_id and ac-id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


    @Test(priority = 2, description = "Invalid Customer Id and Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Plaid flow with Invalid Parameters")
    public void Invalid_cust_id_ac_id() throws IOException {
        String Scenarioname = "Invalid cust_id, ac_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


}
