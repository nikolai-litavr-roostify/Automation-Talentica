package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class AboutYouSection
{
    public AboutYouSection(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

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

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(id = "loan_application_b_marital_status_1")
    private WebElement marital_status;

    @FindBy(id = "loan_application_b_dependents")
    private WebElement age;

    @FindBy(id = "loan_application_b_years_schooling")
    private WebElement education;

    @FindBy(id = "loan_application_b_address_attributes_0_address1")
    private WebElement address_1;

    @FindBy(id = "loan_application_b_address_attributes_0_city")
    private WebElement city;

    @FindBy(id = "loan_application_b_address_attributes_0_state")
    private WebElement state;

    @FindBy(id = "loan_application_b_address_attributes_0_zip")
    private WebElement zip;

//    @FindBy(how = How.CSS, using = "//label[@class='btn active']")
//    private WebElement property_yes;

    @FindBy(xpath = "//span[text()='No']")
    private WebElement armed_services_no;

    @FindBy(xpath = "//div[@class='col-12 col-md-4 form-group']/button[@value='next']")
    private WebElement fix_later_continue;

    @FindBy(xpath = "//h1[contains(text(),'How do we get in touch with you?')]")
    private WebElement header_about_you;

    @FindBy(xpath = "//span[text()='Yes, this application will include a co-borrower']")
    private WebElement add_coborrower;

    @FindBy(css = "#loan_application_applicants_attributes_0_first_name")
    private WebElement co_fname;

    @FindBy(css = "#loan_application_applicants_attributes_0_last_name")
    private WebElement co_lname;

    @FindBy(css = "#loan_application_applicants_attributes_0_email")
    private WebElement co_email;

    @FindBy(css = "#loan_application_applicants_attributes_0_phone")
    private WebElement co_phone;

    @FindBy(id = "applicant_address_attributes_0_address1")
    private WebElement coborrower_address_1;

    @FindBy(id = "applicant_address_attributes_0_city")
    private WebElement coborrower_city;

    @FindBy(id = "applicant_address_attributes_0_state")
    private WebElement coborrower_state;

    @FindBy(id = "applicant_address_attributes_0_zip")
    private WebElement coborrower_zip;

    @FindBy(xpath = "//*[@id='loan_application_form']/div[2]/div/div[5]/fieldset/div[2]/label")
    private WebElement include_coborrower;


    public void header_about_you() {
        String str = header_about_you.getText();
        Assert.assertEquals("How do we get in touch with you?", str, "Verify About You header");
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
        //  property_yes.click();
        next_button.click();
        sleep();
        next_button.click();
        sleep();
        next_button.click();
        sleep();
        armed_services_no.click();
        next_button.click();
        sleep();
        fix_later_continue.click();
        sleep();

    }
    public void address_Details1() {
        address_1.sendKeys("463 7th Avenue");
        sleep();
        city.sendKeys("San Francisco");

        state.click();
        Select s4 = new Select(state);
        s4.selectByVisibleText("CA");
        state.click();
        zip.sendKeys("94118");
        next_button.click();
        next_button.click();
        sleep();
    }


    public void add_coborrower()
    {
        add_coborrower.click();
        next_button.click();
    }

    public void co_fname()
    {
        co_fname.sendKeys("Cofname");
        sleep();
    }

    public void co_lname()
    {
        co_lname.sendKeys("Colname");
        sleep();
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

    public void co_email(String email)
    {
        sleep();
        email = "vwagh+"+getSaltString()+"@roostify.com";
        co_email.sendKeys(email);
    }

    public void co_phone()
    {
        sleep();
        co_phone.sendKeys("1234567890");
        sleep();
        next_button.click();

    }

    public void include_coborrower()
    {
        sleep();
        include_coborrower.click();
        next_button.click();
    }

    public void armed_services() {
        sleep();
        armed_services_no.click();
        next_button.click();
        fix_later_continue.click();
        sleep();
        next_button.click();
    }

    public void coborrower_address()
    {

        coborrower_address_1.sendKeys("463 7th Avenue");
        sleep();
        coborrower_city.sendKeys("San Francisco");

        coborrower_state.click();
        Select s4 = new Select(coborrower_state);
        s4.selectByVisibleText("CA");
        coborrower_state.click();
        coborrower_zip.sendKeys("94118");
        //  property_yes.click();
        next_button.click();
    }


}
