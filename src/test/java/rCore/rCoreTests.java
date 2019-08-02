package rCore;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.reusableMethods;
import roostify.rCore.payLoad.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class rCoreTests {
    Properties prop = new Properties();
    String loanId="";
    String taskId="";
    String documentId="";
    String messageId="";
    String accountId="";
    String userId="";
    String acgId="";

    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Configurations//config.properties");
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
                        .body(loanCreation.getLoancreationData()).when().post("loan_applications").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
         loanId = js.get("id");
        System.out.println("Loan Application Id :-"+loanId);

    }


    @Test(priority = 0)
    public void getLoanDetails()
    {
        Response res =
                given().header("Content-Type", "application/json").get("loan_applications/6140392445581286").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
    }

    @Test(priority = 0)
    public void getTaskList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("tasks?loan_application_id="+loanId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        int taskCount = js.get("id.size");
        System.out.println(taskCount);

    }

    @Test(priority = 0)
    public void createTask()
    {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(tasks.getTaskCreationData(loanId)).when().post("tasks").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
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
                given().header("Content-Type", "application/json").body(tasks.updateTaskData()).when().put("tasks/"+taskId+"").then().assertThat().statusCode(200).extract().response();

    }

    @Test(priority = 2)
    public void uploadDocument()
    {
        Response res =
                given().header("Content-Type", "application/json").
                        body(documents.getUploadDocumentData(loanId,taskId)).when()
                        .post("documents").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
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

        JsonPath js = reusableMethods.rawToJson(res);
        String base64data= js.get("contents");
        String str = reusableMethods.removeNewLineCharacter(base64data);
        reusableMethods.createFile(str);

    }

    @Test(priority = 5)
    public void createMessage() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(messages.getCreateMessageData(loanId)).when().post("messages").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        messageId= js.get("id");
        System.out.println("Message Id :-"+messageId);
        System.out.println("Message Content:-"+js.get("content"));
    }



    @Test(priority = 5)
    public void getMessageList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("messages").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);
        int messagesCount = js.get("id.size");
        System.out.println("Total Message count:-"+messagesCount);
    }

  /*  @Test(priority = 5)
    public void retrieveMessage()
    {
        Response res =
                given().header("Content-Type", "application/json").get("messages/"+messageId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = ReusableMethods.rawToJson(res);
        System.out.println("Message Content:-"+js.get("content"));
    }*/


    @Test(priority = 6)
    public void getAccountList()
    {
        Response res =
                given().header("Content-Type", "application/json").get("accounts").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);
        Object accountNo= js.get("id");
        accountId= reusableMethods.ObjectToString(accountNo);
        System.out.println("Account Id:-"+accountId);
        System.out.println("Account Name:-"+ reusableMethods.ObjectToString(js.get("name")));
    }

    @Test(priority = 6)
    public void retrieveAccount()
    {
        Response res =
                given().header("Content-Type", "application/json").get("accounts/"+accountId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);
        Object accountNo= js.get("id");
        accountId= reusableMethods.ObjectToString(accountNo);
        System.out.println("Account Id:-"+accountId);
        System.out.println("Account Name:-"+ reusableMethods.ObjectToString(js.get("name")));
        System.out.println(reusableMethods.getSaltString());

    }

   /* @Test(priority = 5)
    public void createStatusUpdate() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(StatusUpdate.getStatusUpdateData(loanId)).when().post("status_updates").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        System.out.println((char[]) js.get("id"));
    }*/

    @Test(priority = 6)
    public void retrieveService()
    {
        Response res =
                given().header("Content-Type", "application/json").get("service").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);
        Object id= js.get("id");
        String serviceId= reusableMethods.ObjectToString(id);
        System.out.println("Service Id:-"+serviceId);
        System.out.println("Service Name:-"+ reusableMethods.ObjectToString(js.get("name")));

    }


    @Test(priority = 7)
    public void getUserList() throws IOException {
        Response res =
                given().header("Content-Type", "application/json").get("users").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        int userCount= js.get("users.size");
        System.out.println("Users Count :-"+userCount);
    }

    @Test(priority = 7)
    public void createUser_Lender() throws IOException {
        Response res =
                given().header("Content-Type", "application/json")
                        .body(user_Management.getCreateUserData()).when().post("users").then().assertThat().statusCode(201).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        userId= js.get("id");
        System.out.println("User Id :-"+userId);
    }

    @Test(priority = 7)
    public void retrieveUser_Lender()
    {
        Response res =
                given().header("Content-Type", "application/json").get("users/"+userId+"").then().assertThat().statusCode(200).extract().response();

        JsonPath js = reusableMethods.rawToJson(res);
        String user_email= js.get("email");
        System.out.println("User Email Id:-"+user_email);


    }

    @Test(priority = 8)
    public void deactivate_User()
    {
        Response res =
                given().header("Content-Type", "application/json").delete("users/"+userId+"/lock").then().assertThat().statusCode(204).extract().response();

    }

    @Test(priority = 9)
    public void activate_User()
    {
        Response res =
                given().header("Content-Type", "application/json").post("users/"+userId+"/unlock").then().assertThat().statusCode(204).extract().response();

    }


    @Test(priority = 9)
    public void updateUser_Lender() throws IOException {
        Response res =
                given().header("Content-Type", "application/json").body(user_Management.getUpdateUserData()).when().put("users/"+userId+"").then().assertThat().statusCode(204).extract().response();

    }

    @Test(priority = 10)
    public void update_User_Secondary_Accounts() throws IOException {
        Response res =
                given().header("Content-Type", "application/json").body(user_Management.AddUsersSecondaryAccountData()).when().put("users/"+userId+"/accounts").then().assertThat().statusCode(204).extract().response();
    }

    @Test(priority = 11)
    public void createAccess_control_group(){
        Response res =
                given().header("Content-Type", "application/json")
                        .body(accessControlGroup.getACGData()).when().post("access_control_groups").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        acgId= js.get("id");
        System.out.println("Access Control Group Id :-"+acgId);
    }

    @Test(priority = 11)
    public void updateAccess_control_group(){
        Response res =
                given().header("Content-Type", "application/json")
                        .body(accessControlGroup.getACGData()).when().put("access_control_groups/"+acgId+"").then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
        String system_name= js.get("system_name");
        System.out.println("Updated System Name :-"+system_name);
    }

    /*@Test(priority = 11)
    public void createLead(){
       // RestAssured.baseURI="https://perf-test.roostify.com/api/";
        Response res =
                given().header("Content-Type", "application/json")
                        .body(User_Management.getCreateLeadData()).when().post("draft/leads").then().assertThat().statusCode(200).extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        String leadId= js.get("id");
        System.out.println("Lead Id :-"+leadId);
    }*/




}
