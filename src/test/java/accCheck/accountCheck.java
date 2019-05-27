package accCheck;

import base.TestListener;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import roostify.accCheck.AccCheckPortalPage;
import roostify.accCheck.PayLoad;
import roostify.base.Base;
import roostify.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

@Listeners({TestListener.class})
@Epic("Account Check Regression")
@Feature("Verify Account Check functionality")
public class AccountCheck extends Base {

    private Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
    }

    @Test(priority = 0, description = "Valid scenario with all parameters")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Account check flow with valid scenario")
    public void accCheck_Valild_AccountChek_Flow_with_all_parameters() throws IOException {
        String Scenarioname="Valild_AccountChek_Flow_with_all_parameters";
//      ExtentTestManager.getTest().log(Status.INFO, "Hey im in Base test1 1");

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = ReusableMethods.getSrcLink(data);
        System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        AccCheckPortalPage acp = new AccCheckPortalPage(driver);
        acp.loginToDagBank(Scenarioname);
        acp.clickShareAccounts();
        acp.validateSuccessMessage();
    }


    @Test
    public void accCheck_Valild_AccountChek_Flow_with_only_mandatory_parameters() throws IOException {
        String Scenarioname="Valild_AccountChek_Flow_with_only_mandatory_parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = ReusableMethods.getSrcLink(data);
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
        acp.validateSuccessMessage();
    }


    @Test
    public void accCheck_Null_Zip_Code() throws IOException {

        String Scenarioname="Null_Zip_Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");


    }

    @Test
    public void accCheck_Null_Address_line_1() throws IOException {

        String Scenarioname="Null_Address_line_1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");


    }

    @Test
    public void accCheck_Null_Last_Name() throws IOException {

        String Scenarioname="Null_Last_Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");


    }

    @Test
    public void accCheck_Null_SSN() throws IOException {

        String Scenarioname="Null_SSN";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_email_address() throws IOException {

        String Scenarioname="Null_email_address";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_First_Name() throws IOException {

        String Scenarioname="Null_First_Name";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }



    @Test
    public void accCheck_SSN_less_than_9_digits() throws IOException {

        String Scenarioname="SSN_less_than_9_digits";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_SSN_greater_than_9_digits() throws IOException {

        String Scenarioname="SSN_greater_than_9_digits";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address1() throws IOException {

        String Scenarioname="Invalid_email_address1";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }
    @Test
    public void accCheck_Invalid_email_address2() throws IOException {

        String Scenarioname="Invalid_email_address2";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address3() throws IOException {

        String Scenarioname="Invalid_email_address3";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address4() throws IOException {

        String Scenarioname="Invalid_email_address4";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address5() throws IOException {

        String Scenarioname="Invalid_email_address5";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_Zip_Code() throws IOException {

        String Scenarioname="Invalid_Zip_Code";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_customer_id() throws IOException {

        String Scenarioname="Invalid_customer_id";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_account_id() throws IOException {

        String Scenarioname="Invalid_account_id";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_customer_id() throws IOException {

        String Scenarioname="Null_customer_id";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_account_id() throws IOException {

        String Scenarioname="Null_account_id";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_verification_type() throws IOException {

        String Scenarioname="Invalid_verification_type";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_verification_type() throws IOException {

        String Scenarioname="Null_verification_type";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_first_name_last_name_ssn_email_verification_type() throws IOException {

        String Scenarioname="Null_first_name_last_name_ssn_email_verification_type";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email() throws IOException {

        String Scenarioname="zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_cust_id_and_ac_id() throws IOException {

        String Scenarioname="Null_cust_id_and_ac_id";

                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();

    }

}
