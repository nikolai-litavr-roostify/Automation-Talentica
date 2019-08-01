package ppe;


import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import listener.TestListener;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import resources.ReusableMethods;
import roostify.base.Base;
import roostify.ppe.payLoad;
import utilities.ReadConfig;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

@Listeners({TestListener.class})
@Epic("PPE Regression")
@Feature("Verify PPE functionality")
public class PPE_OB_Tests extends Base {

    Properties prop = new Properties();

    @BeforeTest
    public void  getHostURL() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
        prop.load(fis);
        RestAssured.baseURI = prop.getProperty("PPEHost");

    }



    @Test(priority = 0, description = "FHA_Primary_house_good_fico_of_15_30_Fixed_Variable_for_Single_family")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Primary_house_good_fico_of_15_30_Fixed_Variable_for_Single_family() throws IOException {
        String Scenarioname = "FHA_Primary_house_good_fico_of_15_30_Fixed_Variable_for_Single_family";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");
        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }

    }

    @Test(priority = 0, description = "FHA_Primary_house_fair_fico_of_30_Fixed_for_Detached_Condominium")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Primary_house_fair_fico_of_30_Fixed_for_Detached_Condominium() throws IOException {
        String Scenarioname = "FHA_Primary_house_fair_fico_of_30_Fixed_for_Detached_Condominium";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }

    @Test(priority = 0, description = "FHA_Primary_house_excellent_fico_of_15_Fixed_for_Parking_Stall")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Primary_house_excellent_fico_of_15_Fixed_for_Parking_Stall() throws IOException {
        String Scenarioname = "FHA_Primary_house_excellent_fico_of_15_Fixed_for_Parking_Stall";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }

    @Test(priority = 0, description = "FHA_Primary_house_good_fico_of_30_Variable_for_Duplex_Side_By_Side")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Primary_house_good_fico_of_30_Variable_for_Duplex_Side_By_Side() throws IOException {
        String Scenarioname = "FHA_Primary_house_good_fico_of_30_Variable_for_Duplex_Side_By_Side";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }

    @Test(priority = 0, description = "FHA_Primary_house_good_fico_of_30_Fixed_for_Duplex_Up_And_Down")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Primary_house_good_fico_of_30_Fixed_for_Duplex_Up_And_Down() throws IOException {
        String Scenarioname = "FHA_Primary_house_good_fico_of_30_Fixed_for_Duplex_Up_And_Down";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }

    @Test(priority = 0, description = "FHA_Investment_house_good_fico_of_15_Variable_for_Half_Duplex")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Investment_house_good_fico_of_15_Variable_for_Half_Duplex() throws IOException {
        String Scenarioname = "FHA_Investment_house_good_fico_of_15_Variable_for_Half_Duplex";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }

    @Test(priority = 0, description = "FHA_Secondary_house_good_fico_of_15_30_Fixed_Variable_for_Townhouse")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Secondary_house_good_fico_of_15_30_Fixed_Variable_for_Townhouse() throws IOException {
        String Scenarioname = "FHA_Secondary_house_good_fico_of_15_30_Fixed_Variable_for_Townhouse";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");

        for(int i=0;i<productsTotal;i++)
        {
            String productName=js.get("products["+i+"].product_name");
            System.out.println("Product Name:- "+productName );
        }
    }


    @Test(priority = 1, description = "FHA_Empty_Mortgage_Balance")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void FHA_Empty_Mortgage_Balance() throws IOException {
        String Scenarioname = "FHA_Empty_Mortgage_Balance";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);

    }

    @Test(priority = 1, description = "Cash_Amount_less_than_25000")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void Cash_Amount_less_than_25000() throws IOException {
        String Scenarioname = "Cash_Amount_less_than_25000";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");
        Assert.assertEquals(productsTotal,0);

    }

    @Test(priority = 1, description = "Equal_Cash_and_Mortgage_Amount")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void Equal_Cash_and_Mortgage_Amount() throws IOException {
        String Scenarioname = "Equal_Cash_and_Mortgage_Amount";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int productsTotal=js.get("product_total");
        Assert.assertEquals(productsTotal,0);
    }

    @Test(priority = 1, description = "Property_Value_Less_Than_Cash_Amount")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with valid Parameters")
    public void Property_Value_Less_Than_Cash_Amount() throws IOException {
        String Scenarioname = "Property_Value_Less_Than_Cash_Amount";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Zip_Code")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Zip_Code() throws IOException {
        String Scenarioname = "Invalid_Zip_Code";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Mortgage_balance")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Mortgage_balance() throws IOException {
        String Scenarioname = "Invalid_Mortgage_balance";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Current_Property_Value")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Current_Property_Value() throws IOException {
        String Scenarioname = "Invalid_Current_Property_Value";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Customer_Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Customer_Id() throws IOException {
        String Scenarioname = "Invalid_Customer_Id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Account_Id")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Account_Id() throws IOException {
        String Scenarioname = "Invalid_Account_Id";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Loan_Types")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Loan_Types() throws IOException {
        String Scenarioname = "Invalid_Loan_Types";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Property_Type")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Property_Type() throws IOException {
        String Scenarioname = "Invalid_Property_Type";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Loan_Amortization")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Loan_Amortization() throws IOException {
        String Scenarioname = "Invalid_Loan_Amortization";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Fico_Score")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Fico_Score() throws IOException {
        String Scenarioname = "Invalid_Fico_Score";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_Adjustable_Rate_Terms")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_Adjustable_Rate_Terms() throws IOException {
        String Scenarioname = "Invalid_Adjustable_Rate_Terms";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

    @Test(priority = 1, description = "Invalid_loan_purpose")
    @Severity(SeverityLevel.NORMAL)
    @Story("PPE_Heloc Flow with invalid Parameters")
    public void Invalid_loan_purpose() throws IOException {
        String Scenarioname = "Invalid_loan_purpose";

        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1257").header("Authorization","asfa").
                        header("Accept","application/json")
                        .body(payLoad.getPostData(Scenarioname)).when().post("products").then().assertThat().statusCode(payLoad.getExpected(Scenarioname)).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
    }

}
