package pageObjects;

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

public class ProfilePage {

    WebDriver driver;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "js-settings-link")
    public WebElement settings;

    @FindBy(xpath = "//nav[@aria-label='Contextual navigation']//a[@data-content='Profile']")
    public WebElement Profile;

    @FindBy (id = "user_first_name")
    public WebElement UserFirstName;

    @FindBy (id = "user_last_name")
    public WebElement UserLastName;

    @FindBy (id = "user_suffix")
    public WebElement UserSuffix;

    @FindBy (id = "user_email")
    public WebElement UserEmail;

    @FindBy (id = "user_mobile_phone")
    public WebElement UserMobilePhone;

    @FindBy (id = "user_home_phone")
    public WebElement UserOfficePhone;

    @FindBy (id = "user_sso_reference_id")
    public WebElement UserSSO;

    @FindBy (id = "user_license_number")
    public WebElement UserNMLS;

    @FindBy (id = "user_referral_token")
    public WebElement UserReferralToken;

    @FindBy (id = "enable_instant_messaging")
    public WebElement EnableInstantMessaging;

    @FindBy (xpath = "//*[@data-input='js-profile-upload']")
    public WebElement UploadPhotoButton;

    @FindBy (id = "user_photo")
    public WebElement UploadPhoto;

    @FindBy (id = "user_details_form_submit")
    public WebElement Save;

    public void clickOnSettingsTab(){
        settings.click();
    }

    public void clickOnProfileTab(){
        Profile.click();
    }

    public void verifyAllProfilePageLabelsDisplayed()
    {
        Assert.assertTrue(UserFirstName.isDisplayed());
        Assert.assertTrue(UserLastName.isDisplayed());
        Assert.assertTrue(UserSuffix.isDisplayed());
        Assert.assertTrue(UserEmail.isDisplayed());
        Assert.assertTrue(UserMobilePhone.isDisplayed());
        Assert.assertTrue(UserOfficePhone.isDisplayed());
        Assert.assertTrue(UserSSO.isDisplayed());
        Assert.assertTrue(UserNMLS.isDisplayed());
        Assert.assertTrue(UserReferralToken.isDisplayed());
        Assert.assertTrue(UploadPhotoButton.isDisplayed());
//        driver.quit();

    }

    public void updateFirstName(){
        UserFirstName.clear();
        UserFirstName.sendKeys("Vaibhav");
        Save.click();
        String First_Name = UserFirstName.getAttribute("value");
        Assert.assertEquals(First_Name,"Vaibhav");



    }

    public void updateLastName(){
        UserLastName.clear();
        UserLastName.sendKeys("Jain");
        Save.click();
        String Last_Name = UserLastName.getAttribute("value");
        Assert.assertEquals(Last_Name,"Jain");


    }

    public void updateEmail(){
        UserEmail.clear();
        UserEmail.sendKeys("vchoudhary+admin@roostify.com");
        Save.click();
        String Email = UserEmail.getAttribute("value");
        Assert.assertEquals(Email,"vchoudhary+admin@roostify.com");
        UserEmail.clear();
        UserEmail.sendKeys("roostify_admin@roostify.com");

    }

    public void updateReferralToken(){
        UserReferralToken.clear();
        UserReferralToken.sendKeys("vchoudhary");
        Save.click();
        String Token = UserReferralToken.getAttribute("value");
        Assert.assertEquals(Token,"vchoudhary");
    }

    public void adminUpdateNMLSNumber(){
        UserNMLS.clear();
        UserNMLS.sendKeys("12345678");
        Save.click();
        String NMLS = UserNMLS.getAttribute("value");
        Assert.assertEquals(NMLS,"12345678");

    }

    public void adminUpdateMobilePhone() {
        UserMobilePhone.clear();
        UserMobilePhone.sendKeys("3214567890");
        Save.click();
        String MobilePhone = UserMobilePhone.getAttribute("value");
        Assert.assertEquals(MobilePhone,"(321) 456-7890");

    }


    public void adminUpdateOfficePhone() {
        UserOfficePhone.clear();
        UserOfficePhone.sendKeys("3290567890");
        Save.click();
        String OfficePhone = UserOfficePhone.getAttribute("value");
        Assert.assertEquals(OfficePhone,"(329) 056-7890");

    }

}