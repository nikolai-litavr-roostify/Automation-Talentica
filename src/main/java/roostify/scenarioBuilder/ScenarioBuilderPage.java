package roostify.scenarioBuilder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import roostify.base.base;

public class ScenarioBuilderPage extends base {

    public ScenarioBuilderPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='ng-pristine ng-valid ng-touched']")
    WebElement dropdownPurposeOfLoan;

    @FindBy(xpath = "//*(//*[@class='sb-highlight'])[2]")
    WebElement txtPurchasePrice;

    @FindBy(xpath = "//*[@class='sb-percent-input sb-value-present ng-pristine ng-valid ng-touched']")
    WebElement basePrice;

    @FindBy(xpath = "(//*[@class='sb-highlight'])[4]")
    WebElement txtZipCode;




}
