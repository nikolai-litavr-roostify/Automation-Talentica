package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OverviewPage {
    WebDriver driver;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    @FindBy (xpath = "//*[contains(text(),'Overview Stats')]")
    WebElement lblOverviewStats;

    public void verifyOverviwStatsLabel()
    {

        Assert.assertTrue(lblOverviewStats.isDisplayed());
    }

    @FindBy (xpath = "//*[@id='account_filter']")
    WebElement accountsDropDown;

    public void selectAccount()
    {
        Select acc_dropdown = new Select(accountsDropDown);
        acc_dropdown.selectByVisibleText("Roostify");
        sleep();
    }

    @FindBy(xpath = "//*[@class='strong' and contains(text(),'Roostify')]")
    WebElement lblRoostify;

    public void verifyLabelRoostify()
    {
        sleep();
        Assert.assertTrue(lblRoostify.isDisplayed());
    }

    public void verifyAccountsDropDown()
    {
        Assert.assertTrue(accountsDropDown.isDisplayed());
    }

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Lenders')]")
    WebElement lblLenders;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Borrowers')]")
    WebElement lblBorrowers;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Applications Started')]")
    WebElement lblApplicationsStarted;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Applications Submitted')]")
    WebElement lblApplicationsSubmitted;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Exports')]")
    WebElement lblExports;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Documents Uploaded')]")
    WebElement lblDocumentsUploaded;

    @FindBy(xpath = "//*[@class='c-tile-button__label' and contains(text(),'Timelines')]")
    WebElement lblTimelines;

    public void verifyAlltheLabelsDisplayed()
    {
        Assert.assertTrue(lblLenders.isDisplayed());
        Assert.assertTrue(lblBorrowers.isDisplayed());
        Assert.assertTrue(lblApplicationsStarted.isDisplayed());
        Assert.assertTrue(lblApplicationsSubmitted.isDisplayed());
        Assert.assertTrue(lblExports.isDisplayed());
        Assert.assertTrue(lblDocumentsUploaded.isDisplayed());
        Assert.assertTrue(lblTimelines.isDisplayed());
    }

    @FindBy(xpath = "//*[@id='quick_filters']")
    WebElement quickFilters;

    @FindBy(xpath = "//*[@class='c-overview__date-filter-row btn btn--sm btn--secondary' and contains(text(),'Month')]")
    WebElement filterMonth;

    @FindBy(xpath = "(//*[@class='pagination'])[3]")
    WebElement pagination;

    @FindBy(xpath = "//*[@class='c-overview__date-filter-row btn btn--sm btn--ghost']")
    WebElement btnClear;

    public void verifyQuickFilters()
    {
        Assert.assertTrue(quickFilters.isDisplayed());
    }

    public void clickMonthFilter()
    {
        filterMonth.click();
        sleep();
    }

    public void clickApplicationStarted()
    {
        lblApplicationsStarted.click();
        sleep();
    }

    public void clickClearButton()
    {
        btnClear.click();
        sleep();
    }

    public  void verifyPaginationClassPresence()
    {
        Assert.assertTrue(pagination.isDisplayed());
    }

    public void verifyClearButtonFunctionality()
    {

        lblApplicationsStarted.click();
        if(!pagination.isDisplayed())
        {
            System.out.println("Verify Clear button test is passed");
        }

    }

    @FindBy(xpath = "//*[@id='js-admin-console-left_pane-6']//a[@data-content='Overview']")
    private WebElement overviewtab;

    public void overviewtab_click()
    {
        overviewtab.click();
    }

}