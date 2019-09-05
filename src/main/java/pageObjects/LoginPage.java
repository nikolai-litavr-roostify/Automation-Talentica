package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user_email")
    private WebElement user_mail;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(id = "loan_first_name")
    private WebElement loan_first_name;

    @FindBy(css = "button[form='sign-in-form']")
    private WebElement click_sign_in;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public void verify_login_labels()
    {
        Assert.assertTrue(user_mail.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(click_sign_in.isDisplayed());
    }

    public void enter_userMail(String UserMail)
    {
        sleep();
        user_mail.sendKeys(UserMail);
        sleep();
    }

    public void enter_password(String Password)
    {
        password.sendKeys(Password);
        sleep();
    }

    public void clickSignIn()
    {
        click_sign_in.click();
    }

    public void login_details()
    {
        enter_userMail("");
        enter_password("");
    }
}



