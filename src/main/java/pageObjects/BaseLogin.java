package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.WaitUtility

public class BaseLogin extends BaseLogin {
    WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement user_Email;

    @FindBy(id = "user_password")
    private WebElement user_Password;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver =  driver;
    }

    public void enter_User_Email(String UserMail)
    {
        WaitUtility.untilPageLoadComplete(driver);
        user_Email.sendKeys(UserMail)
    }

    public void enter_User_Password(String Password)
    {
        WaitUtility.untilPageLoadComplete(driver);
        user_Password.sendKeys(Password)
    }

}