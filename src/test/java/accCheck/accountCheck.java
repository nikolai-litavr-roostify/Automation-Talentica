package accCheck;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.accCheck.accCheckPortalPage;
import roostify.accCheck.payLoad;
import roostify.base.base;
import roostify.reusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class accountCheck extends base {
    private WebDriver driver;

    Properties prop = new Properties();

  /*  @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
        TestBase.setDriver("chrome","https://roostify-gallus-qa.herokuapp.com");

    }*/
    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);

    }

    @Test
    public void accCheck_Valild_AccountChek_Flow_with_all_parameters() throws IOException, InterruptedException {

        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Valild_AccountChek_Flow_with_all_parameters";
       // ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 1");

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);
        base b = new base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        accCheckPortalPage acp = new accCheckPortalPage(driver);
        acp.loginToDagBank();

    }


    @Test
    public void accCheck_Valild_AccountChek_Flow_with_only_mandatory_parameters() throws IOException, InterruptedException {

        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Valild_AccountChek_Flow_with_only_mandatory_parameters";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);

    }


    @Test
    public void accCheck_Null_Zip_Code() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_Zip_Code";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);

    }

    @Test
    public void accCheck_Null_Address_line_1() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_Address_line_1";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);

    }

    @Test
    public void accCheck_Null_Last_Name() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_Last_Name";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String data = js.get("links[0].resource_data");
        String srclink = reusableMethods.getSrcLink(data);

    }

    @Test
    public void accCheck_Null_SSN() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_SSN";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_email_address() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_email_address";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_First_Name() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_First_Name";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }



    @Test
    public void accCheck_SSN_less_than_9_digits() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="SSN_less_than_9_digits";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_SSN_greater_than_9_digits() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="SSN_greater_than_9_digits";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address1() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_email_address1";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }
    @Test
    public void accCheck_Invalid_email_address2() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_email_address2";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address3() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_email_address3";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address4() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_email_address4";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_email_address5() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_email_address5";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_Zip_Code() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_Zip_Code";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_customer_id() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_customer_id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_account_id() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_account_id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_customer_id() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_customer_id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_account_id() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_account_id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Invalid_verification_type() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Invalid_verification_type";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_verification_type() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_verification_type";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_first_name_last_name_ssn_email_verification_type() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_first_name_last_name_ssn_email_verification_type";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

    @Test
    public void accCheck_Null_cust_id_and_ac_id() throws IOException, InterruptedException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        String Scenarioname="Null_cust_id_and_ac_id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1129")
                        .body(payLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

    }

}
