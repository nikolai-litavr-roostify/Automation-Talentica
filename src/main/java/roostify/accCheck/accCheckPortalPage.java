package roostify.accCheck;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import resources.DataDriven;
import roostify.Demo;
import roostify.base.*;

import java.io.IOException;
import java.util.ArrayList;

public class AccCheckPortalPage {
    private static Logger log = LogManager.getLogger(Demo.class.getName());
    public WebDriver driver;
    String User = "";
    String Password = "";
    Base b = new Base();


    public AccCheckPortalPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//*[@id='search']");
    By lblDagBank = By.xpath("(//*[contains(text(),'DagBank')])[1]");
    //By login =By.xpath("//*[@id='LOGIN']");
    By Username =By.xpath("//*[@id='LOGIN']");
    By password = By.xpath("//*[@id='PASSWORD1']");
    By btnSubmit =By.xpath("//*[@class='btn btn-blue']");
    By txtSuccessMessage = By.xpath("//*[contains(text(),'Great! Your accounts have been')]");
    By btnShareAccounts = By.xpath("//button[@class='btn btn-blue btn-block'][not(@disabled)]");
    By txtShare2Accounts = By.xpath("//*[contains(text(),'Share 2 Accounts')]");



    public WebElement SearchBox(){
        return driver.findElement(searchBox);
    }
    public WebElement LblDagBank(){
        return driver.findElement(lblDagBank);
    }
    public WebElement Username(){
        return driver.findElement(Username);
    }
    public WebElement Password(){
        return driver.findElement(password);
    }
    public WebElement BtnSubmit(){
        return driver.findElement(btnSubmit);
    }
    public WebElement btnShareAccounts(){
        return driver.findElement(btnShareAccounts);
    }

    public WebElement txtSuccessMessage(){
        return driver.findElement(txtSuccessMessage);
    }
    public WebElement txtShare2Accounts(){
        return driver.findElement(txtShare2Accounts);
    }





    public void sendTxtToSeachBox() throws IOException {
        String search = "Dagbank";
        SearchBox().sendKeys(search);
        log.info("Bank Name Send");
        b.captureScreenMethod();
    }

    public void clickBankName(){
        LblDagBank().click();
    }

    public void sendUsername() throws IOException {
        if(Username().isDisplayed())
        {
            Username().sendKeys(User);
            b.captureScreenMethod();
        }
    }

    public void sendPassword(){
        if(Password().isDisplayed())
        {
            Password().sendKeys(Password);
        }
    }

    public void clickSubmitButton() throws IOException {
        if(BtnSubmit().isDisplayed())
        {
            BtnSubmit().click();
            b.captureScreenMethod();
        }
    }

    public void clickShareAccounts() throws IOException {
        btnShareAccounts().click();
        b.captureScreenMethod();

    }

    public void validateSuccessMessage() throws IOException {
            Assert.assertTrue(txtSuccessMessage().isDisplayed());
            System.out.println("Test Successfully Passed");
            b.captureScreenMethod();

    }


    public void loginToDagBank(String Scenarioname) throws IOException {
        sendTxtToSeachBox();
        clickBankName();
        getLoginData(Scenarioname);
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        //int x = driver.findElements(By.xpath("//iframe")).size();
//       System.out.println(x);

        //driver.switchTo().frame(0);
        sendUsername();
        sendPassword();
        clickSubmitButton();
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnShareAccounts));
        /*if(!btnShareAccounts().isDisplayed())
        {
            log.error("Element not displayed");
        }*/
        clickShareAccounts();
        wait.until(ExpectedConditions.presenceOfElementLocated(txtSuccessMessage));
        validateSuccessMessage();
    }

    public void getLoginData(String Scenarioname) throws IOException {
        DataDriven d=new DataDriven();
        String Sheetname = "AccountCheck";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        User= (String) data.get(19);
        System.out.println(User);
        Password=(String) data.get(20);
        System.out.println(Password);

    }


}

