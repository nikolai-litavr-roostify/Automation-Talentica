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
    private WebElement usr_Email;

    @FindBy(id = "user_password")
    private WebElement usr_Password;

    public WebElement get_User_Email_Element() {
        return usr_Email;
    }

    public WebElement get_User_Password_Element() {
        return usr_Password;
    }

    public void BaseLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver =  driver;
    }

    public void enter_User_Email(String user_Email)
    {
        WaitUtility.untilPageLoadComplete(driver);
        usr_Email.sendKeys(user_Email);
    }

    public void enter_User_Password(String user_Password)
    {
        WaitUtility.untilPageLoadComplete(driver);
        usr_Password.sendKeys(user_Password);
    }

}