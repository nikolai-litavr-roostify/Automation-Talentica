package plaid;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.base.Base;
import roostify.plaid.PayLoad;
import roostify.ReusableMethods;
import roostify.plaid.PlaidPortalPage;
import utilities.ReadConfig;
import java.io.IOException;
import static io.restassured.RestAssured.given;

public class PlaidTests extends Base {

    @BeforeTest
    public void getData(){
        RestAssured.baseURI = (String) ReadConfig.getVerificationServiceHost();
    }

    @Test
    public void Valild_Plaid_Flow_with_all_parameters() throws IOException {
        String Scenarioname="Valild Plaid Flow with all parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String srclink = js.get("links[0].resource_location");
        System.out.println(srclink);
        Base b = new Base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink);
        PlaidPortalPage ppp = new PlaidPortalPage(driver);
        ppp.loginToPlaid(Scenarioname);
    }


    @Test
    public void Valild_Plaid_Flow_with_only_mandatory_parameters() throws IOException {
        String Scenarioname = "Valild Plaid Flow with only mandatory parameters";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String srclink = js.get("links[0].resource_location");
    }

    @Test
    public void Null_Zip_Code() throws IOException {
        String Scenarioname = "Null Zip Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_Address_line_1() throws IOException {
        String Scenarioname = "Null Address line 1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_Last_Name() throws IOException {
        String Scenarioname = "Null Last Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_SSN() throws IOException {
        String Scenarioname = "Null SSN";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_email_address() throws IOException {
        String Scenarioname = "Null email address";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_First_Name() throws IOException {
        String Scenarioname = "Null First Name";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void SSN_less_than_9_digits() throws IOException {
        String Scenarioname = "SSN less than 9 digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void SSN_greater_than_9_digits() throws IOException {
        String Scenarioname = "SSN greater than 9 digits";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_email_address1() throws IOException {
        String Scenarioname = "Invalid email address1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_email_address2() throws IOException {
        String Scenarioname = "Invalid email address2";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


    @Test
    public void Invalid_email_address3() throws IOException {
        String Scenarioname = "Invalid email address3";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_email_address4() throws IOException {
        String Scenarioname = "Invalid email address4";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_email_address5() throws IOException {
        String Scenarioname = "Invalid email address5";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_Zip_Code() throws IOException {
        String Scenarioname = "Invalid Zip Code";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_customer_id() throws IOException {
        String Scenarioname = "Invalid customer_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_account_id() throws IOException {
        String Scenarioname = "Invalid account_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_customer_id() throws IOException {
        String Scenarioname = "Null customer_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_account_id() throws IOException {
        String Scenarioname = "Null account_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_verification_type() throws IOException {
        String Scenarioname = "Invalid verification_type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_verification_type() throws IOException {
        String Scenarioname = "Null verification_type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_first_name_last_name_ssn() throws IOException {
        String Scenarioname = "Null first name, last name, ssn";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void zip_code_less_than_5_digits_ssn_less_than_9_null_fist_and_last_name_invalid_email() throws IOException {
        String Scenarioname = "zip code less than 5 digits, ssn less than 9, null fist and last name, invalid email";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Null_cust_id_and_ac_id() throws IOException {
        String Scenarioname = "Null cust_id and ac-id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test
    public void Invalid_cust_id_ac_id() throws IOException {
        String Scenarioname = "Invalid cust_id, ac_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(PayLoad.getPostData(Scenarioname)).when().post().then().assertThat().statusCode(PayLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }


}
