package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class ConnectionPage {
    WebDriver driver;

    public ConnectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    @FindBy(linkText = "Connections")
    private WebElement connection_link;

    @FindBy(xpath = "//button[@name='button']")
    private WebElement add_connection;

    @FindBy(name = "user[first_name]")
    private WebElement connection_fname;

    @FindBy(name = "user[last_name]")
    private WebElement connection_lname;

    @FindBy(name = "user[email]")
    private WebElement connection_email;

    @FindBy(xpath = "//button[@class='btn btn--primary mt-2 float-right' and contains(text(),'Invite')]")
    private WebElement invite_connection;

    @FindBy(linkText = "Connect Now")
    private WebElement connect_now;

    @FindBy(xpath = "//button[@class='btn btn--primary text-center mb-3 js-create-account']")
    private WebElement complete_registration;

    @FindBy(id = "signup_password")
    private WebElement signup_password;

    @FindBy(id = "r_terms_check")
    private WebElement click_terms_conditions;

    public void connection()
    {
        sleep();
        connection_link.click();
    }

    public void add_connection()
    {
        sleep();
        add_connection.click();
    }

    public void connection_fname()
    {
        sleep();
        connection_fname.sendKeys("Confname");
    }

    public void connection_lname()
    {
        sleep();
        connection_lname.sendKeys("Conlname");
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
    public void connection_email(String email)
    {
        sleep();
        email = "vwagh+"+getSaltString()+"@roostify.com";
        connection_email.sendKeys(email);
    }

    public void invite_connection()
    {
        sleep();
        invite_connection.click();
        sleep();
    }

    public void connect_now()
    {
        sleep();
        connect_now.click();
        sleep();

    }

    public void complete_registration()
    {
        sleep();
        complete_registration.click();
    }

    public void enter_signup_password(String password)
    {
        signup_password.sendKeys("Abcd1234");
    }

    public void click_terms_conditions()
    {
        click_terms_conditions.click();
    }


}