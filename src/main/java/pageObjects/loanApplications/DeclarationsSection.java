package pageObjects.loanApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeclarationsSection {

    public DeclarationsSection(WebDriver driver)
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

    @FindBy(how = How.XPATH, using = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_citizen_true']")
    private WebElement us_citizen_yes;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_lawsuit_false']")
    private WebElement lawsuit_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_judgements_false']")
    private WebElement judgements_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_down_payment_borrowed_false']")
    private WebElement downpayment_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_note_debt_false']")
    private WebElement note_debt_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_bankruptcy_false']")
    private WebElement bankruptcy_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_property_foreclosure_false']")
    private WebElement property_foreclosure_no;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_loan_foreclosure_false']")
    private WebElement loan_foreclosure_no ;

    @FindBy(how = How.XPATH, using = "//label[@for='applicant_has_default_false']")
    private WebElement delinquint_no;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_hmda_female_true']")
    private WebElement gender;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_hmda_cuban_true']")
    private WebElement ethnicity;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_hmda_asian_indian_true']")
    private WebElement race;

    @FindBy(how = How.XPATH, using = "//input[@id='b_ssn']")
    private WebElement ssn;

    @FindBy(how = How.XPATH, using = "//input[@id='allow_credit_no']")
    private WebElement allow_credit;

    @FindBy(how = How.XPATH, using = "//input[@id='loan_application_b_estimated_credit_fair']")
    private WebElement credit_estimate;

    @FindBy(how = How.XPATH, using = "//button[text()='Fix later and continue']")
    private WebElement fix_later_continue_button;

    public void declarations_Section()
{
    next_button.click();
}

    public void us_Citizen()
    {
        us_citizen_yes.click();
        next_button.click();
    }

    public void more_Details1()
    {
         lawsuit_no.click();
         judgements_no.click();
         note_debt_no.click();
         next_button.click();
    }

    public void more_Details2()
    {
        bankruptcy_no.click();
        property_foreclosure_no.click();
        loan_foreclosure_no.click();
        delinquint_no.click();
        next_button.click();
    }

    public void hmda_Section()
    {
         gender.click();
         ethnicity.click();
         race.click();
         next_button.click();
    }

    public void ssn_Details()
    {
        ssn.sendKeys("123456789");
        next_button.click();
    }

    public void allow_Credit()
    {
        allow_credit.click();
        next_button.click();
    }
     public void credit_Estimate()
     {
         credit_estimate.click();
         next_button.click();
     }
    public void continue_Section()
    {
        fix_later_continue_button.click();
        sleep();
        sleep();
    }

}
