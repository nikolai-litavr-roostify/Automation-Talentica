package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.PublicKey;
import java.util.Random;

public class UserPage
{
    WebDriver driver;
    String confirm_email;



    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public UserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    // Invite user as Member

    @FindBy(id = "js-admin-console-link-left_pane-5")
    private WebElement click_admin_console;

    @FindBy (xpath = "(//*[@class='c-nav__link-text' and contains(text(),'Users')])[2]")
    WebElement users_tab;

    @FindBy (xpath = "//*[@class='icon icon--offset icon--active far fa-user-plus c-icon']")
    WebElement Invite_a_user_icon;

    @FindBy (id = "user_email")
    WebElement user_email;

    @FindBy(id = "user_email_confirmation")
    WebElement user_email_confirmation;

    @FindBy (id = "user_assigned_role")
    WebElement user_assigned_role;

    @FindBy (id = "user_primary_account")
    WebElement user_primary_account;

    @FindBy (xpath = "//button[@class='btn dropdown-toggle bs-placeholder btn-info c-select-picker']")
    WebElement user_secondary_account;

    @FindBy (xpath = "//div[@class='bs-searchbox']/input[@type='text']")
    WebElement txt_SecondaryAccount_SearchBox;

    @FindBy(xpath = "//h1[contains(text(), 'Invite a New User to this Account')]")
    WebElement invite_txt;

    @FindBy(id = "user_invite_submit")
    WebElement btn_SendInvite;

    @FindBy (id = "user_assigned_role")
    WebElement user_assigned_AdminRole;

    @FindBy(xpath = "//button[@class='bulk-invite-to-account-link tt-anchor btn btn--circle btn--disguised']")
    WebElement btn_BulkInviteUser;

    @FindBy(xpath = "//input[@id='import_user_upload']")
    WebElement btn_addFile;

    @FindBy (xpath = "(//*[@id=\"send_invite\"])[2]")
    WebElement checkbox_sendInvitation;

    @FindBy (xpath = "//button[@class='btn btn--primary' and contains(text(),'Upload')]")
    WebElement btn_upload;

    @FindBy (xpath = "//select[@id = 'account_filter']")
    WebElement userSearchAccount;

    @FindBy(xpath = "//*[@class='c-search__icon js-search-bar-toggle far fa-search c-icon']")
    WebElement searchIcon;

    @FindBy (xpath = "//input[@id='search']")
    WebElement txtbox_search;

    public void click_admin_console() {
        click_admin_console.click();
    }

    public void clickOnUsersTab(){
        users_tab.click();
    }

     public void clickOnInviteAUserIcon(){
         Invite_a_user_icon.click();
     }

    public String getSaltString()
    {
    String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 10) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;

    }

     public void enterUserEmail(String UserEmail){
         sleep();
         UserEmail = "pujapatil+"+getSaltString()+"@roostify.com";
         user_email.sendKeys(UserEmail);
         user_email.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));

     }

    public void enterUserConfirmEmail(){
        user_email_confirmation.clear();
        sleep();
        user_email_confirmation.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }

    public void selectRoleForUser(){
        Select user_role = new Select(user_assigned_role);
        user_role.selectByVisibleText("Member");
        user_assigned_role.click();
    }

    public void selectPrimaryAccountForUser(){
        user_primary_account.click();
        sleep();
        Select user_prime_account = new Select(user_primary_account);
        user_prime_account.selectByValue("9700136338681391");
        user_primary_account.click();
        sleep();

    }

    public void selectSecondaryAccountForUser()
    {
        sleep();
        user_secondary_account.click();
    }

    public void enterUserSecondaryAccount(){

        txt_SecondaryAccount_SearchBox.sendKeys("Child Roostify",Keys.ENTER);
        txt_SecondaryAccount_SearchBox.click();
        invite_txt.click();
    }

    public void clickOnSendInvite()
    {
        btn_SendInvite.click();
    }

// Invite user as Admin:

    public void selectRoleForUserAsAdmin(){
        Select user_role = new Select(user_assigned_AdminRole);
        user_role.selectByVisibleText("Admin");
        user_assigned_AdminRole.click();

    }

    // Bulk Invite Users Using CSV

    public void clickOnBulkInviteIcon()
    {
        btn_BulkInviteUser.click();
    }

    public void clickOnAddFileButton()
    {
        btn_addFile.sendKeys("C:\\Users\\VivekW\\Downloads\\bulk_upload2.csv");
    }

    public void clickOnSendInvitation(){
        sleep();
        checkbox_sendInvitation.click();
    }

    public void clickOnUploadButton(){
        btn_upload.click();
    }

    //  Search an user:

    public void clickOnUserSearchAccount(){
        Select userAccount = new Select(userSearchAccount);
        userAccount.selectByVisibleText("Roostify");
    }

    public void clickOnSearchIcon(){
        searchIcon.click();
    }

    public void clickOnSearchTextBox(){
        txtbox_search.sendKeys("Puja Patil");
    }

}

