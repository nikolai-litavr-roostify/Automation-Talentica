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

    @FindBy(xpath = "//*[@id=\"dashboard_content\"]/div/div[1]/nav/ul/li[4]/a")
    private WebElement tab_Team;

    @FindBy(xpath = "//*[@name='button']")
    private WebElement btn_Add_team_member;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle btn-light']")
    private WebElement drpdwn_Person_to_add;

    @FindBy(xpath = "//div[@class=\"bs-searchbox\"]/input")
    private WebElement txt_SearchBox;

    @FindBy(xpath = "//select[@name='role']")
    private WebElement drpdwn_Role;

    @FindBy(xpath = "//*[@class='btn btn--primary float-right']")
    private WebElement btn_Add_to_Team;

    @FindBy(xpath = "(//*[@class='tt-anchor btn btn--circle btn--disguised btn--xsm'])[1]")
    private WebElement deleteMember;

    @FindBy(xpath = "(//*[@class='btn btn--danger float-right' and contains (text(), 'Yes, remove')])[1]")
    private WebElement removeMember;

    @FindBy (xpath = "//button[@class='btn dropdown-toggle btn-light']")
    private WebElement drpdwn_non_existing_Person_to_add;

    @FindBy(xpath = "//div[@class=\"bs-searchbox\"]/input")
    private WebElement txt_search_box;

    @FindBy(xpath = "//*[@class='no-results' and contains(text(),'No results matched')]")
    private WebElement txt_noresultsmatched;

    public void ClickOnTeamTab() {
        sleep();
        tab_Team.click();
    }

    public void ClickOnAddTeamMember() {
        sleep();
        btn_Add_team_member.click();
        sleep();
    }

    public void SelectPersonToAdd() {
        drpdwn_Person_to_add.click();
    }

    // Add Underwriter

    public void enterPersonTpAddValue() {
        txt_SearchBox.sendKeys("pujapatil+underwriter@roostify.com", Keys.ENTER);

    }

    public void SelectRoleAsUnderwriter() {
        drpdwn_Role.click();

        Select droprole = new Select(drpdwn_Role);

        droprole.selectByVisibleText("Underwriter");
    }

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

    public void DeleteTeamMember() {
        deleteMember.click();

    }

    public void ClickOnYesRemoveButton() {
        removeMember.click();
    }

    // Negative testing - Add Non Existing User (or user from other account) To Team

    public void selectNonExistingUser(){
        drpdwn_non_existing_Person_to_add.click();
    }

    public void enterNonExistingUser() {
        txt_SearchBox.sendKeys("Callifornia Admin", Keys.ENTER);
    }

    public void verifyTextNoResultsMatched() {
        String verifyString = txt_noresultsmatched.getText();
        System.out.println("text is :"+verifyString);
       Assert.assertTrue(verifyString.contains("No results matched"));

    }
}
