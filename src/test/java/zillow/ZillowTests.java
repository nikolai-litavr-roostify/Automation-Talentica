package zillow;

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
import roostify.zillow.payLoad;
import resources.ReusableMethods;
import roostify.zillow.ZillowPortalPage;
import utilities.ReadConfig;
import java.io.IOException;
import static io.restassured.RestAssured.given;


public class ZillowTests extends base {

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

    @Test(priority = 0, description = "Valild Zillow Flow (with City+State+Zip Combination)")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Zillow flow with valid scenario")
    public void Valild_Zillow_Flow_with_City_State_Zip_Combination() throws IOException {
        String Scenarioname = "Valild_Zillow_Flow_with_City_State_Zip_Combination";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        String verificationId=js.get("id");
        String srclink1 = js.get("links[0].resource_location");
        System.out.println(srclink1);
        String srclink2 = js.get("links[1].resource_location");
        System.out.println(srclink2);
        String srclink3 = js.get("links[2].resource_location");
        System.out.println(srclink3);
        String srclink4 = js.get("links[3].resource_location");
        System.out.println(srclink4);
        base b = new base();
        WebDriver driver= b.initialzeDriver();
        driver.navigate().to(srclink1);
        ZillowPortalPage zpp = new ZillowPortalPage(driver);
        zpp.sleep();
        System.out.println(driver.getTitle());
        driver.navigate().to(srclink2);
        System.out.println(driver.getTitle());
        driver.navigate().to(srclink3);
        zpp.sleep();
        System.out.println(driver.getTitle());
        driver.navigate().to(srclink4);
        zpp.sleep();
        System.out.println(driver.getTitle());
        driver.close();
    }



    @Test(priority = 0, description = "Valid Zillow Flow (with City+State Combination)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valid_Zillow_Flow_with_City_State_Combination() throws IOException {
        String Scenarioname = "Valid_Zillow_Flow_with_City_State_Combination";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valild Zillow Flow (with Zip)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valild_Zillow_Flow_with_Zip() throws IOException {
        String Scenarioname = "Valild_Zillow_Flow_with_Zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valid Zillow Flow (with Address Line 2) with zip null")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valid_Zillow_Flow_with_Address_Line_2_with_zip_null() throws IOException {
        String Scenarioname = "Valid_Zillow_Flow_with_Address_Line_2_with_zip_null";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valid Zillow Flow (with Address Line 2) with city+state null")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valid_Zillow_Flow_with_Address_Line_2_with_city_state_null() throws IOException {
        String Scenarioname = "Valid_Zillow_Flow_with_Address_Line_2_with_city_state_null";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valild Zillow Flow (with City+State+Zip Combination) Zip code starting with zero")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valild_Zillow_Flow_with_City_State_Zip_Combination_Zip_code_starting_with_zero() throws IOException {
        String Scenarioname = "Valild_Zillow_Flow_with_City_State_Zip_Combination_Zip_code_starting_with_zero";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 0, description = "Valild Zillow Flow (with Zip starting with zero)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with valid scenario")
    public void Valild_Zillow_Flow_with_Zip_starting_with_zero() throws IOException {
        String Scenarioname = "Valild_Zillow_Flow_with_Zip_starting_with_zero";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }



    @Test(priority = 1, description = "Address line 1 with city (null state)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Address_line_1_with_city_null_state() throws IOException {
        String Scenarioname = "Address_line_1_with_city_null_state";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Address line 1 with state (null city)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Address_line_1_with_state_null_city() throws IOException {
        String Scenarioname = "Address_line_1_with_state_null_city";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Address Line1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_Address_Line1() throws IOException {
        String Scenarioname = "Null_Address_Line1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Address line 1 with null zip")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Address_line_1_with_null_zip() throws IOException {
        String Scenarioname = "Address_line_1_with_null_zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "With only address line 1 (Null address line 2)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void With_only_address_line_1() throws IOException {
        String Scenarioname = "With_only_address_line_1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Address line 1 with city (with empty state and null zip)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Address_line_1_with_city_with_empty_state_and_null_zip() throws IOException {
        String Scenarioname = "Address_line_1_with_city_with_empty_state_and_null_zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }


    @Test(priority = 1, description = "Address line 1 with state (with empty city and null zip)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Address_line_1_with_state_with_empty_city_and_null_zip() throws IOException {
        String Scenarioname = "Address_line_1_with_city_with_empty_state_and_null_zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "With address line 2 and city+state (Null address line 1 and zip code)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void With_address_line_2_and_city_state() throws IOException {
        String Scenarioname = "With_address_line_2_and_city_state";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "With address line 2 and zip (Null address line 1, city and state)")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void With_address_line_2_and_zip() throws IOException {
        String Scenarioname = "With_address_line_2_and_zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }




    @Test(priority = 1, description = "Null Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_customer_id() throws IOException {
        String Scenarioname = "Null_customer_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_account_id() throws IOException {
        String Scenarioname = "Null_account_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Verification Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_verification_type() throws IOException {
        String Scenarioname = "Null_verification_type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null add line, city, zip code, state")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_add_line_city_zip_code_state() throws IOException {
        String Scenarioname = "Null_add_line_city_zip_code_state";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 1, description = "Null Customer Id and Account Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Null Parameters")
    public void Null_cust_id_ac_id() throws IOException {
        String Scenarioname = "Null_cust_id_ac_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Account ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_Account_ID() throws IOException {
        String Scenarioname = "Invalid_Account_ID";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Customer ID")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_Customer_ID() throws IOException {
        String Scenarioname = "Invalid_Customer_ID";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Verification Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_Verification_Type() throws IOException {
        String Scenarioname = "Invalid_Verification_Type";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Address Line1")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_Address_Line1() throws IOException {
        String Scenarioname = "Invalid_Address_Line1";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid State")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_State() throws IOException {
        String Scenarioname = "Invalid_State";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }


    @Test(priority = 2, description = "Invalid Zip")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_Zip() throws IOException {
        String Scenarioname = "Invalid_Zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }


    @Test(priority = 2, description = "Invalid City")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_City() throws IOException {
        String Scenarioname = "Invalid_City";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }


    @Test(priority = 2, description = "Invalid City + State Combination without zip")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_City_State_Combination_without_zip() throws IOException {
        String Scenarioname = "Invalid_City_State_Combination_without_zip";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }


    @Test(priority = 2, description = "Invalid City + State + Zip Combination ")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_City_State_Zip_Combination() throws IOException {
        String Scenarioname = "Invalid_City_State_Zip_Combination";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }

    @Test(priority = 2, description = "Invalid Account Id and Customer Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("Zillow flow with Invalid Parameters")
    public void Invalid_ac_id_cust_id() throws IOException {
        String Scenarioname = "Invalid_ac_id_cust_id";
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1130")
                        .body(payLoad.getPostData(Scenarioname)).when().post("/properties/estimates").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
    }




}
