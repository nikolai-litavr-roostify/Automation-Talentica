package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class TeamPage {
    WebDriver driver;

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public TeamPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "((//*[@class='c-nav__link-text' and contains(text(),'Team')])[2]) | (//*[@id=\"dashboard_content\"]/div/div[1]/nav/ul/li[3]/a)")
    private WebElement tab_Team;

    public void ClickOnTeamTab() {
        sleep();
        tab_Team.click();
    }

    @FindBy(xpath = "//*[@name='button']")
    private WebElement btn_Add_team_member;

    public void ClickOnAddTeamMember() {
        sleep();
        btn_Add_team_member.click();
        sleep();
    }

    @FindBy(xpath = "//button[@class='btn dropdown-toggle btn-light']")
    private WebElement drpdwn_Person_to_add;

    public void SelectPersonToAdd() {
        drpdwn_Person_to_add.click();
    }

    // Add Underwriter

    @FindBy(xpath = "//div[@class=\"bs-searchbox\"]/input")
    private WebElement txt_SearchBox;

    public void enterPersonTpAddValue() {
        txt_SearchBox.sendKeys("pujapatil+underwriter@roostify.com", Keys.ENTER);

    }

    @FindBy(xpath = "//select[@name='role']")
    private WebElement drpdwn_Role;

    public void SelectRoleAsUnderwriter() {
        drpdwn_Role.click();

        Select droprole = new Select(drpdwn_Role);

        droprole.selectByVisibleText("Underwriter");
    }

    @FindBy(xpath = "//*[@class='btn btn--primary float-right']")
    private WebElement btn_Add_to_Team;

    public void ClickOnAddToTeam() {
        btn_Add_to_Team.click();
    }


    // Add Assistant

    public void enterPersonTpAddAsAssistantValue() {
        txt_SearchBox.sendKeys("pujapatil+assistant@roostify.com", Keys.ENTER);

    }

    public void SelectRoleAsAssistant() {
        drpdwn_Role.click();
        Select droprole = new Select(drpdwn_Role);
        droprole.selectByVisibleText("Assistant");
    }

    // Add Processor

    public void enterPersonTpAddAsProcessorValue() {
        txt_SearchBox.sendKeys("pujapatil+processor@roostify.com", Keys.ENTER);

    }

    public void SelectRoleAsProcessor() {
        drpdwn_Role.click();
        Select droprole = new Select(drpdwn_Role);
        droprole.selectByVisibleText("Processor");
    }

    // Delete Team Member

    @FindBy(xpath = "(//*[@class='tt-anchor btn btn--circle btn--disguised btn--xsm'])[1]")
    private WebElement deleteMember;

    public void DeleteTeamMember() {
        deleteMember.click();

    }

    @FindBy(xpath = "(//*[@class='btn btn--danger float-right' and contains (text(), 'Yes, remove')])[1]")
    private WebElement removeMember;

    public void ClickOnYesRemoveButton() {
        removeMember.click();
    }

    // Negative testing - Add Non Existing User (or user from other account) To Team

    @FindBy (xpath = "//button[@class='btn dropdown-toggle btn-light']")
    private WebElement drpdwn_non_existing_Person_to_add;

    public void selectNonExistingUser(){
        drpdwn_non_existing_Person_to_add.click();
    }


    @FindBy(xpath = "//div[@class=\"bs-searchbox\"]/input")
    private WebElement txt_search_box;

    public void enterNonExistingUser() {
        txt_SearchBox.sendKeys("Callifornia Admin", Keys.ENTER);
    }

    @FindBy(xpath = "//*[@class='no-results' and contains(text(),'No results matched')]")
    private WebElement txt_noresultsmatched;

    public void verifyTextNoResultsMatched() {
        String verifyString = txt_noresultsmatched.getText();
        System.out.println("text is :"+verifyString);
       Assert.assertTrue(verifyString.contains("No results matched"));

    }
}
