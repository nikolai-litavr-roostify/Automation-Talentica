package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.WaitUtility;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Coborrowerflowpage {
    WebDriver driver;

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public Coborrowerflowpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "loan_application_b_address_attributes_0_address1")
    private WebElement address_1;

    @FindBy(id = "loan_application_b_address_attributes_0_city")
    private WebElement city;

    @FindBy(id = "loan_application_b_address_attributes_0_state")
    private WebElement state;

    @FindBy(id = "loan_application_b_address_attributes_0_zip")
    private WebElement zip;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//span[text()='No']")
    private WebElement armed_services_no;

    @FindBy(xpath = "//div[@class='col-12 col-md-4 form-group']/button[@value='next']")
    private WebElement fix_later_continue;

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

    @FindBy(linkText = "Application Release")
    private WebElement applicatiion_release;

    @FindBy(id = "applicant_address_attributes_0_address1")
    private WebElement coborrower_address_1;

    @FindBy(id = "applicant_address_attributes_0_city")
    private WebElement coborrower_city;

    @FindBy(id = "applicant_address_attributes_0_state")
    private WebElement coborrower_state;

    @FindBy(id = "applicant_address_attributes_0_zip")
    private WebElement coborrower_zip;

    public void address_Details() {
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
        next_button.click();
    }

    public void armed_services() {
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

    public void application_release()
    {
        applicatiion_release.click();
    }

}