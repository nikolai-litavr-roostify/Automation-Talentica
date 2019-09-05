package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

public class AddLoanManuallyPreConPage {
    WebDriver driver;

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    public AddLoanManuallyPreConPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[@class='icon--active far fa-file-edit c-icon']")
    private WebElement add_loan_man;

    @FindBy(id = "loan_email")
    private WebElement loan_email;

    @FindBy(id = "loan_first_name")
    private WebElement loan_first_name;

    @FindBy(id= "loan_last_name")
    private WebElement loan_last_name;

    @FindBy(id= "user_account_token_select")
    private WebElement click_SelectAccount;

    @FindBy(xpath = "//input[@value='Create']")
    private WebElement click_create_button;

    @FindBy(xpath ="//a[@title=\"Continue on behalf of borrower\"]")
    private WebElement admin_flow;

    @FindBy(xpath = "//button[@class='btn btn--block btn--primary js-step-nav']")
    private WebElement admin_continue;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement about_you_next;

    @FindBy(id = "loan_application_b_middle_initial")
    private WebElement middle_name;

    @FindBy(id = "loan_application_b_suffix")
    private WebElement suffix;

    @FindBy(id = "loan_application_b_phone")
    private WebElement primary_phone;

    @FindBy(id = "loan_application_b_marital_status_1")
    private WebElement marital_status;

    @FindBy(id = "loan_application_b_dependents")
    private WebElement age;

    @FindBy(id = "loan_application_b_years_schooling")
    private WebElement education;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(id = "loan_application_b_address_attributes_0_address1")
    private WebElement address_1;

    @FindBy(id = "loan_application_b_address_attributes_0_city")
    private WebElement city;

    @FindBy(id = "loan_application_b_address_attributes_0_state")
    private WebElement state;

    @FindBy(id = "loan_application_b_address_attributes_0_zip")
    private WebElement zip;

    @FindBy(xpath = "//span[text()='No']")
    private WebElement armed_services_no;

    @FindBy(xpath = "//div[@class='col-12 col-md-4 form-group']/button[@value='next']")
    private WebElement fix_later_continue;

    public void verify_AddLoanManuallyLabels()
    {
        Assert.assertTrue(add_loan_man.isDisplayed());
        Assert.assertTrue(loan_email.isDisplayed());
        Assert.assertTrue(loan_first_name.isDisplayed());
        Assert.assertTrue(loan_last_name.isDisplayed());
        Assert.assertTrue(click_SelectAccount.isDisplayed());
        Assert.assertTrue(click_create_button.isDisplayed());
        Assert.assertTrue(admin_flow.isDisplayed());
    }

    public void click_Link()
    {
        add_loan_man.click();
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
    public void enter_loanMail(String LoanMail)
    {
        sleep();
        LoanMail = "vwagh+"+getSaltString()+"@roostify.com";
        loan_email.sendKeys(LoanMail);

    }

    public void enter_firstName(String FirstName)
    {
        loan_first_name.sendKeys(FirstName);

    }

    public void enter_lastName(String LastName) {
        loan_last_name.sendKeys(LastName);
    }

    public void select_Account(String selectAccount) {
        click_SelectAccount.click();
        Select s = new Select(click_SelectAccount);
        s.selectByVisibleText(selectAccount);
        click_SelectAccount.click();

    }
    public void click_Create()
    {

        click_create_button.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void loan_Details()
    {
        enter_loanMail("");
        enter_firstName("");
        enter_lastName("");
        select_Account("");
    }

    public void admin_Flow  ()
    {
        sleep();
        admin_flow.click();
    }

    public void admin_Continue()
    {
        sleep();
        admin_continue.click();
    }

    public void admin_ABoutYou_Next()
    {
        about_you_next.click();
    }
    public void primary_Details()
    {
        middle_name.sendKeys("Mname");
        suffix.sendKeys("Mr");
        primary_phone.sendKeys("1111111111");
        next_button.click();
    }

    public void few_more_Details()
    {
        marital_status.click();
        age.sendKeys("25");

        education.click();
        Select s3 = new Select(education);
        s3.selectByVisibleText("Associates Degree");
        education.click();

        next_button.click();

    }

    public void address_Details()
    {
        address_1.sendKeys("463 7th Avenue");
        sleep();
        city.sendKeys("San Francisco");

        state.click();
        Select s4 = new Select(state);
        s4.selectByVisibleText("CA");
        state.click();
        zip.sendKeys("94118");
        next_button.click();
        sleep();
        next_button.click();
        sleep();
        next_button.click();
        sleep();
        armed_services_no.click();
        next_button.click();
        sleep();
        next_button.click();
        sleep();
        fix_later_continue.click();

    }
}



