package plaid;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roostify.plaid.payLoad;
import roostify.reusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;



public class plaidTests {
    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);

    }

    @Test
    public void testPlaid() throws IOException {
        RestAssured.baseURI = prop.getProperty("AccCheckHOST");
        Response res =
                given().header("Content-Type", "application/json").header("X-CORRELATION-ID", "1127")
                        .body(payLoad.getPostData()).when().post().then().assertThat().statusCode(200).extract().response();
        JsonPath js = reusableMethods.rawToJson(res);
       String srclink = js.get("links[0].resource_location");
        System.out.println(srclink);

    }


}
