package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class AddLoanManuallyPreUSDAPage {
    WebDriver driver;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public AddLoanManuallyPreUSDAPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='loan_application_mortgage_type_4']")
    private WebElement usda_loan_type;

    @FindBy(xpath = "//button[@class='js-btn-forward btn btn--block btn--ghost js-substep-nav']")
    private WebElement next_button;

    @FindBy(xpath = "//button[@class='btn--block btn btn--primary js-step-nav']")
    private WebElement continue_button;

    public void usda_loan_type() {
        usda_loan_type.click();
        next_button.click();
        sleep();
    }

    public void click_continue()
    {
        continue_button.click();
        sleep();
    }


}


