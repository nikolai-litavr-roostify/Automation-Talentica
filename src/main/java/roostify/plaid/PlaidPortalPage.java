package roostify.plaid;

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
import roostify.base.Base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaidPortalPage extends Base {

    private static Logger log = LogManager.getLogger(Demo.class.getName());
    public WebDriver driver;
    String User = "";
    String Password = "";
    String User2 = "";
    String Password2 = "";
    Base b = new Base();


    public PlaidPortalPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@class='Button Button--is-plaid-color'])|(//*[@class='Button'][contains(text(),'Continue')])")
    WebElement btnContinue;

    @FindBy(xpath = "//*[@class='InstitutionSearchInput__input']")
    WebElement searchBox;

    @FindBy(xpath = "//iframe[@id='plaid-link-iframe-1']")
    WebElement iframe1;

    @FindBy(xpath = "(//div[@class='Logo Logo--citi Logo--is-light-background'])|(//*[@class='Logo Logo--citi'])")
    WebElement logoCitiBank;

    @FindBy(xpath = "//*[@id='username']")
    WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "(//*[@class='Button'][contains(text(),'Submit')])|(//input[@class='btn btn--primary c-plaid-btn'])")
    WebElement btnSubmit;

    @FindBy(xpath = "//*[contains(text(),'Plaid CD')]")
    WebElement accCD;

    @FindBy(xpath = "//*[contains(text(),'Plaid Checking')]")
    WebElement accChecking;

    @FindBy(xpath = "//*[contains(text(),'Plaid Saving')]")
    WebElement accSaving;

    @FindBy(xpath = "//*[contains(text(),'Plaid Credit Card')]")
    WebElement accCreditCard;

    @FindBy(xpath = "//*[contains(text(),'Plaid Money Market')]")
    WebElement accMM;

    @FindBy(xpath = "//*[contains(text(),'Plaid IRA')]")
    WebElement accIRA;

    @FindBy(xpath = "//*[contains(text(),'Plaid 401k')]")
    WebElement accPlaid401k;

    @FindBy(xpath = "//*[contains(text(),'Plaid Student Loan')]")
    WebElement accStudentLoan;

    @FindBy(xpath = "//*[@class='Button'][contains(text(),'Allow')]")
    WebElement btnAllow;

    @FindBy(xpath = "//input[@class='btn btn--secondary c-plaid-btn js-plaid-accountbtn']")
    WebElement btnAddAnotherAccount;

    @FindBy(xpath = "//*[@class='alert c-alert--success c-alert c-alert--floating alert fade show']")
    WebElement alertSuccess;

    @FindBy(xpath = "//*[@class='fas fa-times c-alert__close']")
    WebElement alertCloseIcon;


    @Step("Click CitiBank logo ")
    public void clickCitiBank(){
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(logoCitiBank));
        logoCitiBank.click();
    }

    @Step("Click Continue Button ")
    public void clickContinue(){
        btnContinue.click();
    }

    @Step("Login Step with Username")
    public void sendUsername(String user){
        if(username.isDisplayed())
        {
            username.sendKeys(user);
        }
    }
    @Step("Login Step with Password")
    public void sendPassword(String pass) throws IOException {
        if(password.isDisplayed())
        {
            password.sendKeys(pass);
            b.captureScreenMethod();
        }
    }

    @Step("Click Submit Button")
    public void clickSubmitButton(){
        if(btnSubmit.isDisplayed())
        {
            btnSubmit.click();
        }
    }
    @Step("Click Allow Button")
    public void clickAllowButton(){
        if(btnAllow.isDisplayed())
        {
            btnAllow.click();
        }
    }

    @Step("Close Success Alert")
    public void closeSuccessAlert(){
        if(alertCloseIcon.isDisplayed())
        {
            alertCloseIcon.click();
            driver.close();
        }
    }

    public void waitForSelectAccoutPage() {
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(logoCitiBank));
    }

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    @Step("Click Plaid Saving Account ")
    public void clickSavingAccount(){
        accSaving.click();
    }

    @Step("Click Plaid Checking Account ")
    public void clickCheckingAccount(){
        accChecking.click();
    }

    @Step("Click Plaid IRA Account ")
    public void clickIRAAccount(){
        accIRA.click();
    }

    @Step("Click Plaid Money Market Account ")
    public void clickMMAccount(){
        accMM.click();
    }

    @Step("Click Plaid CD Account ")
    public void clickCDAccount(){
        accCD.click();
    }

    @Step("Click Plaid Credit Card Account ")
    public void clickCreditCardAccount(){
        accCreditCard.click();
    }

    @Step("Click Plaid 401k Account ")
    public void clickPlaid401kAccount(){
        accPlaid401k.click();
    }

    @Step("Click Plaid Student Loan Account ")
    public void clickStudentLoanAccount(){
        accStudentLoan.click();
    }

    @Step("Validate Submit Message")
    public void validateSuccessMessage() throws IOException {
        WebDriverWait wait=new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(alertSuccess));
        Assert.assertTrue(alertSuccess.isDisplayed());
        System.out.println("Test Successfully Passed");
        b.captureScreenMethod();
    }


    @Step("Login to Plaid")
    public void loginToPlaid(String Scenarioname) throws IOException {

        //driver.switchTo().frame(iframe);
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
       driver.switchTo().frame(iframe);
        clickContinue();
        clickCitiBank();
        getLoginData(Scenarioname);
        sendUsername(User);
        sendPassword(Password);
        clickSubmitButton();
        //waitForSelectAccoutPage();
        //driver.switchTo().frame(iframe1);
       // List<WebElement> al = new ArrayList<WebElement>(driver.findElements(By.xpath("//iframe")));
       // System.out.println(al.size());
      //  System.out.println(al.get(0));
       // driver.switchTo().parentFrame();

       // WebElement iframe2 = driver.findElement(By.xpath("//iframe"));
       // driver.switchTo().frame(iframe2);
        sleep();
        clickCheckingAccount();
        sleep();
        clickSavingAccount();
        sleep();
        clickContinue();
        sleep();
        clickAllowButton();
        sleep();
        driver.switchTo().parentFrame();
        clickSubmitButton();
        validateSuccessMessage();
        closeSuccessAlert();
    }

    public void getLoginData(String Scenarioname) throws IOException {
        DataDriven d=new DataDriven();
        String Sheetname = "Plaid";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        User= (String) data.get(16);
        Password=(String) data.get(17);
        //User2=(String) data.get(21);
       // Password2=(String) data.get(22);
    }

}
