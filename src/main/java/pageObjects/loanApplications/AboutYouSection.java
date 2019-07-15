package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

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
//         dob_month.click();
//         Select s = new Select(dob_month);
//         s.selectByVisibleText("Apr");
//         dob_month.click();
//
//         dob_day.click();
//         Select s1 = new Select(dob_day);
//         s.selectByValue("9");
//         dob_day.click();
//
//
//         dob_year.click();
//         Select s2 = new Select(dob_year);
//         s.selectByVisibleText("1994");
//         dob_year.click();

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

        Robot robot = null;
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        sleep();

    }

}
