package roostify.finicity;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.dataDriven;
import roostify.base.base;

import java.io.IOException;
import java.util.ArrayList;

public class finicityPortalPage extends base {

    public WebDriver driver;
    String User = "";
    String Password = "";
    String User2 = "";
    String Password2 = "";
    base b = new base();

    public finicityPortalPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='next-button-inner']")
    WebElement btnContinue;

    @FindBy(xpath = "//*[@class='agreement layout-row layout-align-center-center']/app-mv-checkbox")
    WebElement chkboxTermsConditions;

    @FindBy(xpath = "//*[@id='account-search']")
    WebElement searchBox;

    @FindBy(xpath = "//*[contains(text(),'FinBank Profiles - A')]")
    WebElement titleFinBankA;

    @FindBy(xpath = "//*[@name='Banking Userid']")
    WebElement username;

    @FindBy(xpath = "//*[@name='Banking Password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='creds-btn-next']")
    WebElement btnNext;

    @FindBy(xpath = "(//*[@class='accounts-list']/li)[1]")
    WebElement account1;

    @FindBy(xpath = "(//*[@class='accounts-list']/li)[2]")
    WebElement account2;

    @FindBy(xpath = "(//*[@class='accounts-list']/li)[3]")
    WebElement account3;

    @FindBy(xpath = "(//*[@class='accounts-list']/li)[4]")
    WebElement account4;

    @FindBy(xpath = "(//*[@class='accounts-list']/li)[5]")
    WebElement account5;

    @FindBy(xpath = "(//*[@id='account-add-button-inner'])|(//*[@id='done-button-inner'])")
    WebElement btnSaveAndContinue;

    @FindBy(xpath = "//*[@id='more-button-inner']")
    WebElement btnSeachMoreBank;



    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }


    @Step("Click Continue Button ")
    public void clickContinue(){
        btnContinue.click();
    }

    @Step("Click Continue Next ")
    public void clickNext(){
        btnNext.click();
    }

    @Step("Click Save and Continue Next ")
    public void clickSaveAndContinue(){
        btnSaveAndContinue.click();
    }

    @Step("Click Search More Banks ")
    public void clickSearchMoreBanks(){
        btnSeachMoreBank.click();
    }



    @Step("Sent name of Bank to SearchBox ")
    public void sendTxtToSeachBox(String search) throws IOException {
        searchBox.sendKeys(search);
        //log.info("Bank Name Send");
        b.captureScreenMethod();
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

    @Step("Click Term and Conditions Check box ")
    public void clickChkboxTermsConditions(){
        chkboxTermsConditions.click();
    }

    @Step("Click FinBank Profiles - A ")
    public void clickFinBankProfiles_A(){
        titleFinBankA.click();
    }





    @Step("Login to Finicity")
    public void loginToFinicity(String Scenarioname) throws IOException {
        clickChkboxTermsConditions();
        clickContinue();
        sendTxtToSeachBox("FinBank Profiles - A");
        clickFinBankProfiles_A();
        getLoginData(Scenarioname);
        sleep();
        sendUsername(User);
        sendPassword(Password);
        clickNext();
        clickSaveAndContinue();
        //sleep();
       // clickSaveAndContinue();

    }

    public void logintoAnotherBank() throws IOException {
        clickSearchMoreBanks();
        sendTxtToSeachBox("FinBank Profiles - A");
        clickFinBankProfiles_A();
        sendUsername("sjhdfgjh");
        sendPassword("profile-03");
        clickNext();
        clickSaveAndContinue();
    }

    public void submitAccounts()
    {
        sleep();
        clickSaveAndContinue();

    }


    public void getLoginData(String Scenarioname) throws IOException {
        dataDriven d=new dataDriven();
        String Sheetname = "Finicity";
        ArrayList data=d.getData(Sheetname,Scenarioname);
        User= (String) data.get(19);
        Password=(String) data.get(20);
       // User2=(String) data.get(21);
        //Password2=(String) data.get(22);
    }

    public void waitForReportGeneration()
    {
        try {
            Thread.sleep(180000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }










}
