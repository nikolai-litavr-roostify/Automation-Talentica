package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.WaitUtility;

public class BaseLogin {
    WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement user_Email;

    @FindBy(id = "user_password")
    private WebElement user_Password;

    public WebElement get_User_Email() {
        return user_Email;
    }

    public WebElement get_User_Password() {
        return user_Password;
    }

    public void BaseLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver =  driver;
    }

    public void enter_User_Email(String usr_Email)
    {
        WaitUtility.untilPageLoadComplete(driver);
        user_Email.sendKeys(usr_Email);
    }

    public void enter_User_Password(String usr_Password)
    {
        WaitUtility.untilPageLoadComplete(driver);
        user_Password.sendKeys(usr_Password);
    }

}