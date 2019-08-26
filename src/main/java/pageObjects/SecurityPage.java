package pageObjects;

import com.codepine.api.testrail.model.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.List;

public class SecurityPage {

    WebDriver driver;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public SecurityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "js-settings-link-left_pane-8")
    public WebElement settings;

    @FindBy(xpath = "//nav[@aria-label='Contextual navigation']//a[@data-content='Security']")
    public WebElement Security;

    @FindBy(id = "user_current_password")
    WebElement UserCurrentPassword;

    @FindBy (id = "user_password")
    WebElement UserNewPassword;

    @FindBy (xpath = "//button[@class='btn btn--primary ajax-submit']")
    WebElement PasswordUpdateSave;

    public void clickOnSecurityTab(){
        Security.click();
    }

    public void verifyAllSecurityPageLabelsDisplayed()
    {
        Assert.assertTrue(UserCurrentPassword.isDisplayed());
        Assert.assertTrue(UserNewPassword.isDisplayed());
        Assert.assertTrue(PasswordUpdateSave.isDisplayed());

    }

    public void InsertIncorrectCurrentPassword(){
        UserCurrentPassword.clear();
        UserCurrentPassword.sendKeys("Incorrect1234");
    }

    public void InsertNewPassword(){
        UserNewPassword.clear();
        UserNewPassword.sendKeys("NewPassword1234");
    }

    public void saveClick()
    {
        PasswordUpdateSave.click();
    }

    public void InsertCurrentPasswordErrorMessage(){
        String expectedText ="Current password is invalid";
        Assert.assertEquals("Current password is invalid",expectedText);
    }

    public void InsertCorrectCurrentPassword(){
        UserCurrentPassword.clear();
        UserCurrentPassword.sendKeys("168Washu");
    }

    public void InsertNewPasswordwithLessLetterCount(){
        UserNewPassword.clear();
        UserNewPassword.sendKeys("nw13");

    }

   public void validateErrorMessageForLessLetterCount(){
       String expectedText ="Password is too short (minimum is 8 characters). Password must include at least one lowercase letter, one uppercase letter, and one digit";
       Assert.assertEquals("Password is too short (minimum is 8 characters). Password must include at least one lowercase letter, one uppercase letter, and one digit",expectedText);
   }

   public void InsertCorrectNewPassordFormat(){
        UserNewPassword.clear();
        UserNewPassword.sendKeys("Test1234");
   }

    public void validatePassowordUpdateSuccessMessage(){
        String expectedText ="Changes successfully saved.";
        Assert.assertEquals("Changes successfully saved.",expectedText);
    }

}
