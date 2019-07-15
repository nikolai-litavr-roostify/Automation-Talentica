package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class InviteBorrowerPage {
    WebDriver driver;

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    public InviteBorrowerPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@class='icon--active far fa-envelope c-icon']")
    private WebElement invite_borrower;

    @FindBy(id = "borrowers_email_field")
    private WebElement enter_email;

    @FindBy(xpath = "//input[@value='Invite']")
    private WebElement invite_button;

    @FindBy(xpath = "//*[@id='js-admin-console']//a[@data-content='Messages']")
    private  WebElement click_messages;

    @FindBy(id = "js-admin-console-link")
    private WebElement click_admin_console;

    @FindBy(xpath = "//*[@id='index_table']/div[2]/table/tbody/tr[1]/td[1]/div/a")
    private WebElement click_message_link;

    @FindBy(linkText = "Start Application")
    private WebElement click_start_application;

    public void click_invite_borrower()
    {
        invite_borrower.click();
    }

    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public void enter_email(String emailId)
    {
        sleep();
        emailId = "vwagh+"+getSaltString()+"@roostify.com";
        enter_email.sendKeys(emailId);
    }

    public void click_invite_button()
    {
        invite_button.click();
    }

    public void click_admin_console()
    {
        click_admin_console.click();
    }

    public void click_messages()
    {
        sleep();
        click_messages.click();
    }

    public void click_message_link()
    {
        sleep();
        click_message_link.click();
        sleep();
    }

    public void click_start_application()
    {
        sleep();
        click_start_application.click();
        sleep();
    }

    public void inviteBorrower()
    {
        enter_email("");
    }
}