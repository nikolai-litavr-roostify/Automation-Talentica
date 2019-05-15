package docuTech;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class docuTechTests {
    Properties prop = new Properties();


    @BeforeTest
    public void getData() throws IOException, InterruptedException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//Enviornment.properties");
        prop.load(fis);

    }

    @Test
    public void createLoan(){
        RestAssured.baseURI = prop.getProperty("LoanCreationHost");
    }
}
