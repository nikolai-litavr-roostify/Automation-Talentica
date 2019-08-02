package finicity;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.base.base;
import roostify.finicity.payLoad;
import resources.ReusableMethods;
import roostify.finicity.FinicityPortalPage;
import utilities.ReadConfig;
import java.io.IOException;
import static io.restassured.RestAssured.given;


public class FinicityTests extends base {


    @BeforeTest
    public void getData(){

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

    @Test(priority = 3, description = "Download the report")
    public void downloadReport(String verificationId)
    {
        FinicityPortalPage fpp = new FinicityPortalPage(driver);
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
            fpp.sleep();
            if (status.equalsIgnoreCase(expected))
            {
                flag=false;
            }

        }while(flag);
        System.out.println(doclink);
        driver.navigate().to((String) doclink);
        fpp.sleep();
        System.out.println("Downloaded Report Successfully");
        driver.close();

    }

    @Test(priority = 0, description = "Valid Finicity flow for Asset Verification (With all parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Asset_Verification_With_all_parameters() throws IOException {
        String Scenarioname="Valid_Finicity_flow_for_Asset_Verification_With_all_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String verificationId=js.get("id");
        String srclink = js.get("links[0].resource_location");
        System.out.println(srclink);
        base b = new base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        FinicityPortalPage fpp = new FinicityPortalPage(driver);
        fpp.loginToFinicity(Scenarioname);
        fpp.submitAccounts();
        downloadReport(verificationId);
    }

    @Test(priority = 0, description = "Valid Finicity flow for Income Verification (With all parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Income_Verification_With_all_parameters() throws IOException {
        String Scenarioname = "Valid_Finicity_flow_for_Income_Verification_With_all_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String srclink = js.get("links[0].resource_location");
        String verificationId=js.get("id");
        System.out.println(srclink);
        base b = new base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        FinicityPortalPage fpp = new FinicityPortalPage(driver);
        fpp.loginToFinicity(Scenarioname);
        fpp.logintoAnotherBank();
        fpp.submitAccounts();
        downloadReport(verificationId);
    }

    @Test(priority = 0, description = "Valid Finicity flow for Asset_Income Verification  (With all parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Asset_Income_Verification_With_all_parameters() throws IOException {
        String Scenarioname = "Valid_Finicity_flow_for_Asset_Income_Verification_With_all_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 0, description = "Valid Finicity flow for Asset Verification (With only mandatory parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Asset_Verification_With_only_mandatory_parameters() throws IOException {
        String Scenarioname = "Valid_Finicity_flow_for_Asset_Verification_With_only_mandatory_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valid Finicity flow for Income Verification (With only mandatory parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Income_Verification_With_only_mandatory_parameters() throws IOException {
        String Scenarioname = "Valid_Finicity_flow_for_Income_Verification_With_only_mandatory_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valid Finicity flow for Asset_Income Verification  (With only mandatory parameters)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Finicity flow with valid scenario")
    public void Valid_Finicity_flow_for_Asset_Income_Verification_With_only_mandatory_parameters() throws IOException {
        String Scenarioname = "Valid_Finicity_flow_for_Asset_Income_Verification_With_only_mandatory_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "With Address line 2 only (Null Address line 1)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void With_Address_line_2_only_Null_Address_line_1() throws IOException {
        String Scenarioname = "With_Address_line_2_only_Null_Address_line_1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "With Address line 1 only (Null Address line 2)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void With_Address_line_1_only_Null_Address_line_2() throws IOException {
        String Scenarioname = "With_Address_line_1_only_Null_Address_line_2";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null both address lines")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_both_address_lines() throws IOException {
        String Scenarioname = "Null_both_address_lines";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null City")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_City() throws IOException {
        String Scenarioname = "Null_City";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null State")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_State() throws IOException {
        String Scenarioname = "Null_State";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null SSN")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_SSN() throws IOException {
        String Scenarioname = "Null_SSN";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Username")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Username() throws IOException {
        String Scenarioname = "Null_Username";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Phone number")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Phone_number() throws IOException {
        String Scenarioname = "Null_Phone_number";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null DOB")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_dob() throws IOException {
        String Scenarioname = "Null_dob";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Email Address")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void null_email_address() throws IOException {
        String Scenarioname = "null_email_address";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Verification Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Verification_Type() throws IOException {
        String Scenarioname = "Null_Verification_Type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Last Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Last_Name() throws IOException {
        String Scenarioname = "Null_Last_Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null First Name")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_First_Name() throws IOException {
        String Scenarioname = "Null_First_Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Zip code")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Zip_code() throws IOException {
        String Scenarioname = "Null_Zip_code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Account ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_Account_ID() throws IOException {
        String Scenarioname = "Null_Account_ID";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null first , last, ssn, dob, both add lines, city, state, zip, phone")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_first_last_ssn_dob_both_add_lines_city_state_zip_phone() throws IOException {
        String Scenarioname = "Null_first_last_ssn_dob_both_add_lines_city_state_zip_phone";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Customer ID and Account ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Null Parameters")
    public void Null_cust_id_and_ac_id() throws IOException {
        String Scenarioname = "Null_cust_id_and_ac_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "SSN less than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void SSN_less_than_9_digits() throws IOException {
        String Scenarioname = "SSN_less_than_9_digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "SSN greater than 9 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void SSN_greater_than_9_digits() throws IOException {
        String Scenarioname = "SSN_greater_than_9_digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid dob (DD/MM/YYYY)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_dob_DD_MM_YYYY() throws IOException {
        String Scenarioname = "Invalid_dob_DD_MM_YYYY";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid dob (MM/YYYY/DD)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_dob_MM_YYYY_DD() throws IOException {
        String Scenarioname = "Invalid_dob_MM_YYYY_DD";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid dob (YYYY/DD/MM)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_dob_YYYY_DD_MM() throws IOException {
        String Scenarioname = "Invalid_dob_YYYY_DD_MM";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid dob (DD/MM/YY)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_dob_DD_MM_YY() throws IOException {
        String Scenarioname = "Invalid_dob_DD_MM_YY";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Username less than 6 characters")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Username_less_than_6_characters() throws IOException {
        String Scenarioname = "Username_less_than_6_characters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid email address1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_email_address1() throws IOException {
        String Scenarioname = "Invalid_email_address1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid email address2")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_email_address2() throws IOException {
        String Scenarioname = "Invalid_email_address2";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid email address3")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_email_address3() throws IOException {
        String Scenarioname = "Invalid_email_address3";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid email address4")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_email_address4() throws IOException {
        String Scenarioname = "Invalid_email_address4";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid email address5")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_email_address5() throws IOException {
        String Scenarioname = "Invalid_email_address5";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalild Verification Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalild_Verification_Type() throws IOException {
        String Scenarioname = "Invalild_Verification_Type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Zip code less than 5 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Zip_code_less_than_5_digits() throws IOException {
        String Scenarioname = "Zip_code_less_than_5_digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Zip code greater than 5 digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Zip_code_greater_than_5_digits() throws IOException {
        String Scenarioname = "Zip_code_greater_than_5_digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Account ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_Account_ID() throws IOException {
        String Scenarioname = "Invalid_Account_ID";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Customer ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_Customer_ID() throws IOException {
        String Scenarioname = "Invalid_Customer_ID";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid dob, both add lines, null city, state, zip code less than 5, ssn less than 9")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_dob_both_add_lines_null_city_state_zip_code_less_than_5_ssn_less_than_9() throws IOException {
        String Scenarioname = "Invalid_dob_both_add_lines_null_city_state_zip_code_less_than_5_ssn_less_than_9";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Cuatomer ID and Account ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Finicity flow with Invalid Parameters")
    public void Invalid_cust_id_ac_id() throws IOException {
        String Scenarioname = "Invalid_cust_id_ac_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

}
