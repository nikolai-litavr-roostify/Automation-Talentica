package roostify.accCheck;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import resources.DataDriven;
import roostify.Demo;
import roostify.base.*;

import java.io.IOException;
import java.util.ArrayList;

public class AccCheckPortalPage extends Base {
    private static Logger log = LogManager.getLogger(Demo.class.getName());
    public WebDriver driver;
    String User = "";
    String Password = "";
    String User2 = "";
    String Password2 = "";
    Base b = new Base();


    public AccCheckPortalPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='search']")
    WebElement searchBox;

    @FindBy(xpath = "(//*[contains(text(),'DagBank')])[1]")
    WebElement lblDagBank;

    @FindBy(xpath = "(//*[contains(text(),'Dag Site')])[1]")
    WebElement lblDagSiteBank;

    @FindBy(xpath = "//*[@id='LOGIN']")
    WebElement username;

    @FindBy(xpath = "(//*[@id='PASSWORD1'])|(//*[@id='PASSWORD'])")
    WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-blue']")
    WebElement btnSubmit;

    @FindBy(xpath = "(//*[contains(text(),'Great! Your accounts have been')])|(//*[contains(text(),'Your accounts have been submitted for review')])")
    WebElement txtSuccessMessage;

    @FindBy(xpath = "//button[@class='btn btn-blue btn-block'][not(@disabled)]")
    WebElement btnShareAccounts;


    @FindBy(xpath = "//*[@id=\"account-review-table\"]/tbody/tr[1]/td[1]/div/label/span[1]")
    WebElement chkboxAccount1;


    @FindBy(xpath = "//*[@id=\"account-review-table\"]/tbody/tr[2]/td[1]/div/label/span[1]")
    WebElement chkboxAccount2;

    @FindBy(xpath = "//*[@class='add-fi']")
    WebElement lnkAddAnotherAccount;

    @Step("Sent name of Bank to SearchBox ")
    public void sendTxtToSeachBox(String search) throws IOException {
        searchBox.sendKeys(search);
        log.info("Bank Name Send");
        b.captureScreenMethod();
    }

    @Step("Click Dag Bank ")
    public void clickDagBankName(){
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(lblDagBank));
        lblDagBank.click();
    }
    @Step("Click DagSite Bank ")
    public void clickDagSiteBankName(){
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(lblDagSiteBank));
        lblDagSiteBank.click();
    }

    @Step("Click Add Another Account link")
    public void clickAddAnotherAcclnk()
    {
        lnkAddAnotherAccount.click();
    }


    @Step("Login Step with Username")
    public void sendUsername(String user) throws IOException {
        if(username.isDisplayed())
        {
            username.sendKeys(user);
            b.captureScreenMethod();
        }
    }
    @Step("Login Step with Password")
    public void sendPassword(String pass){
        if(password.isDisplayed())
        {
            password.sendKeys(pass);
        }
    }

    @Step("Click Submit Button")
    public void clickSubmitButton() throws IOException {
        if(btnSubmit.isDisplayed())
        {
            btnSubmit.click();
            b.captureScreenMethod();
        }
    }

    public void clickShareAccounts() throws IOException {
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(btnShareAccounts));
        btnShareAccounts.click();
        b.captureScreenMethod();

    }

    @Step("Validate Submit Message")
    public void validateSuccessMessage() throws IOException {
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(txtSuccessMessage));
            Assert.assertTrue(txtSuccessMessage.isDisplayed());
            System.out.println("Test Successfully Passed");
            b.captureScreenMethod();
            driver.close();
    }
    public void waitForShareAccounts() {
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(btnShareAccounts));
    }
    @Step("Login to DagBank")
    public void loginToDagBank(String Scenarioname) throws IOException {
        sendTxtToSeachBox("DagBank");
        clickDagBankName();
        getLoginData(Scenarioname);
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        sendUsername(User);
        sendPassword(Password);
        clickSubmitButton();
    }
    @Step("Login to DagSite Bank")
    public void loginToDagSiteBank() throws IOException {
        sendTxtToSeachBox("Dagsite");
        clickDagSiteBankName();
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        sendUsername(User2);
        sendPassword(Password2);
        clickSubmitButton();
    }

    public void getLoginData(String Scenarioname) throws IOException {
        DataDriven d=new DataDriven();
        String Sheetname = "AccountCheck";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        User= (String) data.get(19);
        Password=(String) data.get(20);
        User2=(String) data.get(21);
        Password2=(String) data.get(22);
    }

    @Step("Uncheck First data")
    public void uncheckFirstAccount()
    {
        chkboxAccount1.click();
    }

    @Step("Uncheck Second data")
    public void uncheckSecondAccount()
    {
        chkboxAccount2.click();
    }

}
