package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseLogin {
    WebDriver driver;
    public LoginPage(WebDriver driver)  {
        super.BaseLogin(driver);
    }

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

    public void enter_User_Email(String UserMail)
    {
          super.enter_User_Email(UserMail);
    }

    public void enter_User_Password(String UserMail)
    {
        super.enter_User_Password(Password);
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



