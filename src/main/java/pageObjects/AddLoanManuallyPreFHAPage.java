package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddLoanManuallyPreFHAPage
{
    WebDriver driver;

    public static void sleep()
    {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public AddLoanManuallyPreFHAPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='loan_application_mortgage_type_2']")
    private WebElement fha_loan_type;

    @FindBy(xpath = "//input[@id='loan_application_loan_type_2']")
    private WebElement arm_interest_type;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    @FindBy(id = "3_years")
    private WebElement arm_years;

    public void fha_loan_type() {
        sleep();
        fha_loan_type.click();
        next_button.click();
        sleep();
    }

    public void arm_type()
    {
        arm_interest_type.click();
        next_button.click();
        sleep();
    }

    public void arm_years()
    {
        arm_years.click();
        sleep();
        next_button.click();
        sleep();
        continue_button.click();
    }
}
