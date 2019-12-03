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

    @FindBy(id = "loan_first_name")
    private WebElement loan_First_Name;

    @FindBy(css = "button[form='sign-in-form']")
    private WebElement clck_Sign_In;

    public void verify_Login_Labels()
    {
        Assert.assertTrue(super.get_User_Email_Element().isDisplayed());
        Assert.assertTrue(super.get_User_Password_Element().isDisplayed());
        Assert.assertTrue(get_Click_Sign_In_Element().isDisplayed());
    }

    public void enter_User_Email(String user_Email)
    {
          super.enter_User_Email(user_Email);
    }

    public void enter_User_Password(String user_Password)
    {
        super.enter_User_Password(user_Password);
    }

    public WebElement get_Click_Sign_In_Element()
    {
        return clck_Sign_In;
    }

    public void login_Details()
    {
        enter_User_Email("");
        enter_User_Password("");
    }
}



