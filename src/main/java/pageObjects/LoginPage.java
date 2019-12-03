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
        Assert.assertTrue(super.get_User_Email().isDisplayed());
        Assert.assertTrue(super.get_User_Password().isDisplayed());
        Assert.assertTrue(click_sign_in.isDisplayed());
    }

    public void enter_User_Email(String user_Email)
    {
          super.enter_User_Email(user_Email);
    }

    public void enter_User_Password(String user_Password)
    {
        super.enter_User_Password(user_Password);
    }

    public void clickSignIn()
    {
        click_sign_in.click();
    }

    public void login_details()
    {
        enter_User_Email("");
        enter_User_Password("");
    }
}



