package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.Table.Cell;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class UnassignedAppPage
{
    Boolean editable_check;
	public UnassignedAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@data-content='Unassigned Apps'])[2]")
	private WebElement tab_UnassignedApp;
	
	@FindBy(xpath = "//h1[contains(text(), 'Unassigned Loan Application')]")
	private WebElement header_UnassignedAppsPage;
	
	@FindBy(xpath = "//form[@id='unassigned_archive_loans']/div/table/tbody")
	private WebElement webtbl_UAPLoanApplications;
	
	@FindBy(xpath = "//*[@id='loan_5836']/td[1]/input") 
	private WebElement loan_Name;
	
	@FindBy(xpath = "//*[@id='loan_5836']/td[4]/a[1]")
	private WebElement icon_Review;
	
	@FindBy(xpath = "//button[contains(text(), 'Assign')]")
	private WebElement btn_Assign;
	
	@FindBy(xpath = "//*[@id=\"editable-heading\"]/div[1]/h1")
	private WebElement header_LoanApplication;
	
	@FindBy(xpath = "//a[contains(text(), 'Archive')]")
	private WebElement btn_Archive;
	
	@FindBy(xpath = "//a[contains(text(), 'Show archived')]")
	private WebElement link_ShowArchived;
	
	@FindBy(xpath = "(//a[@data-content='Loan Applications'][contains(.,'Loan Applications')])[2]") 
	private WebElement tab_LoanApplications;
	
	@FindBy(xpath = "//*[@id='loan_applications_controller']/div[23]/div/a[1]")
	private WebElement popup_Next;
	
	@FindBy(xpath = "//*[@id='loan_applications_controller']/div[29]/div/a[1]")
	private WebElement popup_Finish;
	
	@FindBy(xpath = "//h1[contains(@class,'header')]")
	private WebElement header_ArchivedUnassignedApps;
	
	@FindBy(xpath = "//a[contains(.,'Unarchive')]")
	private WebElement btn_Unarchive;
	
	@FindBy(xpath = "(//div[contains(@class,'filter-option-inner')])[2]")
	private WebElement drpdwn_GrantNewPeopleAccess;
	
	@FindBy(xpath = "(//input[contains(@aria-label,'Search')])[1]")
	private WebElement txtbx_EnterUserName;
	
	@FindBy(xpath = "//label[contains(.,'Grant new people access:')]")
	private WebElement selectedDrpdwnValue;
	
	@FindBy(xpath = "//button[contains(.,'Grant Access')]")
	private WebElement btnGrantAccess;
	
	@FindBy(xpath = "(//a[contains(@data-content,'Application Release')])[2]")
	private WebElement tab_ApplicationRelease;
	
	@FindBy(xpath = "//button[contains(.,'Skip Warnings and Submit')]")
	private WebElement btn_SkipWarningsAndSubmit;
	
	@FindBy(xpath = "//a[contains(@title,'Dashboard')]")
	private WebElement link_Dashboard;
	
	public void clickOnUnassignedAppTab()
	{
		tab_UnassignedApp.click();
	}
	
	public void verifyAdminIsOnUnassignedAppsPage()
	{	
		String expectedUAPHeader = header_UnassignedAppsPage.getText().substring(0, 28);
		Assert.assertEquals("Unassigned Loan Applications", expectedUAPHeader, "Not matched");
	}
	
	public void verifyUnassigneAppsPresent()
	{
		List<WebElement> row1 = webtbl_UAPLoanApplications.findElements(By.tagName("tr"));
		int loanEntries = row1.size();
		System.out.println("No of Loan Apps present:" +loanEntries);
		//Assert.assertEquals(3, loanEn tries, "Loan entries matched");
	}
	
	public void clickOnReviewButton(WebDriver driver) throws Exception
	{
		List<WebElement> row1 = webtbl_UAPLoanApplications.findElements(By.tagName("tr"));
		outerloop:  
		for (int rowCntr = 0; rowCntr <= row1.size(); rowCntr++)
		{ 
			  List<WebElement> col1 = row1.get(rowCntr).findElements(By.tagName("td"));
			  int colCntr = col1.size(); 
			  for(int j = 0; j < colCntr; j++)
			  {
				  if(col1.get(j).getText().contains("Submitted"))
				  {
					WebElement btn_Review = driver.findElement(By.xpath("//form[@id='unassigned_archive_loans']/div/table/tbody/tr["+(rowCntr + 1)+"]/td[4]/a"));
					btn_Review.click();
					break outerloop;
				  }
				  
				  
			  }
		}
		
		clickOnEscapeButton();
		Thread.sleep(2000);
	 }

	public void clickOnEscapeButton() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
	}
	public void clickOnAssignButton()
	{ 
		btn_Assign.click();
	}
	
	public void clickOnArchiveButton()
	{
		btn_Archive.click();
	}
	
	public void clickOnShowArchivedLink()
	{
		link_ShowArchived.click();
	}
	
	public void verifyAdminIsOnArchivedLoanAppPage()
	{
		String expectedArchivePageHeader = header_ArchivedUnassignedApps.getText().substring(0, 39);
		System.out.println(expectedArchivePageHeader);
		Assert.assertEquals("Unassigned Loan Applications (Archived)", expectedArchivePageHeader, "Not Matched");
	}
	
	public void clickOnUnarchiveButton()
	{
		btn_Unarchive.click();
	}
	
	public void selectUserToAssignLoanApp(String username, String expectedUsername, WebDriver driver)
	{
		drpdwn_GrantNewPeopleAccess.click();
		editable_check = txtbx_EnterUserName.isEnabled();
		if(editable_check)
		{
			txtbx_EnterUserName.sendKeys(username);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//ul[contains(@class,'dropdown-menu inner show')])[2]")));	
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='dropdown-menu inner show'])[2]/li"));
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getText().contains(expectedUsername))
			{
				list.get(i).click();
				break;
			}
		}
		
		selectedDrpdwnValue.click();
		
	}
	
	public void clickOnGrantAccessButton()
	{
		btnGrantAccess.click();
	}
	
	public void clickOnContinueBehalfOfBorrowerLink(WebDriver driver)
	{
		List<WebElement> row1 = webtbl_UAPLoanApplications.findElements(By.tagName("tr"));
		Outerloop:
		for (int rowCntr = 0; rowCntr < row1.size(); rowCntr++)
		{
			List<WebElement> col = row1.get(rowCntr).findElements(By.tagName("td"));
			for (int colCntr = 0; colCntr < col.size(); colCntr++)
			{
				if((col.get(colCntr).getText().contains("Started")) || (col.get(colCntr).getText().contains("Not Started")))
				{
					WebElement link_ContinueBehalfOfBrwr = driver.findElement(By.xpath("(//div[contains(@class,'icon--active far fa-edit c-icon')])["+(rowCntr + 1)+"]"));
					link_ContinueBehalfOfBrwr.click();
					break Outerloop;
				}
			}
		}
	}
	
	public void clickOnApplicationReleasePage()
	{
		if(tab_ApplicationRelease.isDisplayed())
			tab_ApplicationRelease.click();
		
		btn_SkipWarningsAndSubmit.click();
	}
	
	public void verifyAdminAbleToReviewLoanApp()
	{
		link_Dashboard.click();
	}
	
}



