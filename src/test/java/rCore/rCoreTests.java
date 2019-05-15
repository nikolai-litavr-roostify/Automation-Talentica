package rCore;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.reusableMethods;
import roostify.rCore.payLoad.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class rCoreTests {
    Properties prop = new Properties();
    String loanId="";
    String taskId="";

    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(prop.getProperty("Username"));
        authScheme.setPassword(prop.getProperty("Password"));
        RestAssured.authentication = authScheme;


    }

    @Test(priority = 0)
    public void createLoanApplication() throws IOException {
        RestAssured.baseURI = prop.getProperty("RCoreHost");
        Response res =
                given().header("Content-Type", "application/json")
                        .body(loanCreation.getLoancreationData()).when().post("loan_applications").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
         loanId = js.get("id");
        System.out.println(loanId);

    }

    @Test(priority = 0)
    public void getTaskList()
    {
        RestAssured.baseURI = prop.getProperty("RCoreHost");
        Response res =
                given().header("Content-Type", "application/json").get("tasks?loan_application_id="+loanId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        int taskCount = js.get("id.size");
        System.out.println(taskCount);

    }

    @Test(priority = 0)
    public void createTask()
    {
        RestAssured.baseURI = prop.getProperty("RCoreHost");
        Response res =
                given().header("Content-Type", "application/json")
                        .body(tasks.getTaskCreationData(loanId)).when().post("tasks").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        taskId= js.get("id");
    }

    @Test(priority = 1)
    public void retrieveTask()
    {
        RestAssured.baseURI = prop.getProperty("RCoreHost");
        Response res =
                given().header("Content-Type", "application/json").get("tasks/"+taskId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);

    }

    @Test(priority = 1)
    public void updateTask()
    {
        RestAssured.baseURI = prop.getProperty("RCoreHost");
        Response res =
                given().header("Content-Type", "application/json").body(tasks.updateTaskData()).when().put("tasks/9446789820780943").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);

    }


}
