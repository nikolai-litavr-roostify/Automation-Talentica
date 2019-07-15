package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class SignUpPage {

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    public SignUpPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "r_terms_check")
    private WebElement click_terms_conditions;

    @FindBy(id = "first_name")
    private WebElement enter_first_name;

    @FindBy(id = "last_name")
    private WebElement enter_last_name;

    @FindBy(id = "signup_password")
    private WebElement signup_password;

    @FindBy(id = "signup_email")
    private WebElement signup_mail;

    @FindBy(xpath = "//button[@class='btn btn--primary text-center mb-3 js-create-account']")
    private WebElement start_application;

    public void enter_first_name(String firstName)
    {
        sleep();
        enter_first_name.sendKeys(firstName);
    }

    public void enter_last_name(String lastName)
    {
        enter_last_name.sendKeys(lastName);
    }

    public void enter_signup_password(String password)
    {
        signup_password.sendKeys(password);
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

    public void enter_signup_mail(String mailid)
    {
        sleep();
         mailid = "vwagh+"+getSaltString()+"@roostify.com";
        signup_mail.sendKeys(mailid);

    }

    public void click_terms_conditions()
    {
        click_terms_conditions.click();
    }

    public void start_application()
    {
        start_application.click();
        sleep();
    }
}
