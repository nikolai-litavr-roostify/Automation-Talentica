package rCore;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.ReusableMethods;
import roostify.rCore.payLoad.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class RCoreTests {
    Properties prop = new Properties();
    String loanId="";
    String taskId="";
    String documentId="";
    String messageId="";
    String accountId="";

    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(prop.getProperty("Username"));
        authScheme.setPassword(prop.getProperty("Password"));
        RestAssured.authentication = authScheme;
        RestAssured.baseURI = prop.getProperty("RCoreHost");


    }

    @Test(priority = 0)
    public void createLoanApplication() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(LoanCreation.getLoancreationData()).when().post("loan_applications").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
         loanId = js.get("id");
        System.out.println("Loan Application Id :-"+loanId);

    }

    @Test(priority = 0)
    public void getTaskList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("Tasks?loan_application_id="+loanId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int taskCount = js.get("id.size");
        System.out.println(taskCount);

    }

    @Test(priority = 0)
    public void createTask()
    {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(Tasks.getTaskCreationData("7358827891815459")).when().post("tasks").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        taskId= js.get("id");
        System.out.println("Task Id :-"+taskId);
    }

    @Test(priority = 1)
    public void retrieveTask()
    {
        Response res =
                given().header("Content-Type", "application/json").get("tasks/"+taskId+"").then().assertThat().statusCode(200).extract().response();


    }

    @Test(priority = 1)
    public void updateTask()
    {
        Response res =
                given().header("Content-Type", "application/json").body(Tasks.updateTaskData()).when().put("tasks/"+taskId+"").then().assertThat().statusCode(200).extract().response();

    }

    @Test(priority = 2)
    public void uploadDocument()
    {
        Response res =
                given().header("Content-Type", "application/json").
                        body(Documents.getUploadDocumentData(loanId,taskId)).when()
                        .post("documents").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        documentId=js.get("id");
        System.out.println("Document Upload Id :-"+documentId);

    }

    @Test(priority = 3)
    public void retrieveDocument()
    {
        Response res =
                given().header("Content-Type", "application/json").get("documents/"+documentId+"").then().assertThat().statusCode(200).extract().response();

    }

    @Test(priority = 4)
    public void downloadDocument() throws IOException {
       // String documentId1="8945988125002075";
        Response res =
                given().header("Content-Type", "application/json").get("documents/"+documentId+"/download").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        String base64data= js.get("contents");
        String str = ReusableMethods.removeNewLineCharacter(base64data);
        ReusableMethods.createFile(str);

    }

    @Test(priority = 5)
    public void createMessage() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(Messages.getCreateMessageData(loanId)).when().post("messages").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        messageId= js.get("id");
        System.out.println("Message Id :-"+messageId);
        System.out.println("Message Content:-"+js.get("content"));
    }



    @Test(priority = 5)
    public void getMessageList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("messages").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        int messagesCount = js.get("id.size");
        System.out.println("Total Message count:-"+messagesCount);
    }

    @Test(priority = 5)
    public void retrieveMessage()
    {
        Response res =
                given().header("Content-Type", "application/json").get("messages/"+messageId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        System.out.println("Message Content:-"+js.get("content"));
    }


    @Test(priority = 6)
    public void getAccountList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("accounts").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        Object accountNo= js.get("id");
        accountId= ReusableMethods.ObjectToString(accountNo);
        System.out.println("Account Id:-"+accountId);
        System.out.println("Account Name:-"+ ReusableMethods.ObjectToString(js.get("name")));
    }

    @Test(priority = 6)
    public void retrieveAccount()
    {
        Response res =
                given().header("Content-Type", "application/json").get("accounts/"+accountId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        Object accountNo= js.get("id");
        accountId= ReusableMethods.ObjectToString(accountNo);
        System.out.println("Account Id:-"+accountId);
        System.out.println("Account Name:-"+ ReusableMethods.ObjectToString(js.get("name")));

    }

    @Test(priority = 5)
    public void createStatusUpdate() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(StatusUpdate.getStatusUpdateData(loanId)).when().post("status_updates").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        System.out.println((char[]) js.get("id"));
    }

}
